package com.capsule.main.memo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class MemoDAO {

	public MemoDAO() {
		try {
			System.err.println("DAO 초기화 됐어 ?!");
			FileSystemResourceLoader resourceLoader = new FileSystemResourceLoader();
			Resource resource = resourceLoader.getResource("classpath:serviceKey.json");
			System.out.println(resource.getFilename());
			System.out.println(resource.exists());
			System.out.println(resource.getInputStream());
			InputStream is = resource.getInputStream();
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			InputStream inputStream = resource.getInputStream();

			FirebaseOptions options = FirebaseOptions.builder()
					.setCredentials(GoogleCredentials.fromStream(inputStream))
					.build();

			FirebaseApp.initializeApp(options);
			System.err.println("firebase 초기화 됐어 ?!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Autowired
	private MemoMapper mMapper;

	public List<MemoDTO> getMemoList(int no) {
		return mMapper.getMemoList(no);
	}

	public void insertMemo(MemoMultiDTO memoDTO, int no) {
		try {
			String fileName = memoDTO.getM_file().getOriginalFilename();
			String objectName = "memory/" + fileName;
			System.out.println(objectName);
			System.out.println("upload 로직 시작 --");
			// Firebase Storage 참조 가져오기
			Storage storage = StorageOptions.getDefaultInstance().getService();
			// Firebase Storage에 파일 업로드 gs://happycapsule-7400c.appspot.com/memory
			System.out.println("upload 로직 시작 --");
			BlobId blobId = BlobId.of("happycapsule-7400c", objectName); // 버킷 이름과 객체 이름을 올바르게 전달
			BlobInfo blobInfo = BlobInfo.newBuilder(blobId).build();
			System.out.println("upload 로직 시작 --3");
			Blob blob = storage.create(blobInfo, memoDTO.getM_file().getBytes());
			System.out.println("upload 로직 시작 --4");

			// 업로드된 파일의 다운로드 URL 가져오기
			String downloadUrl = blob.getMediaLink();
			System.out.println("파일이 성공적으로 업로드되었습니다. 다운로드 URL: " + downloadUrl);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//	public int insertMemo(MemoMultiDTO multiDTO, HttpSession hs) {
//		return mMapper.insertMemo(multiDTO, hs);
//	}

}
