package com.capsule.main.memo;

import java.io.FileInputStream;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capsule.main.bottle.BottleMapper;
import com.capsule.main.login.UserDTO;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import jakarta.servlet.http.HttpSession;

@Service
public class MemoDAO {
	@Autowired
	private MemoMapper mMapper;
	
	@Autowired
	private BottleMapper bMapper;

	private int bottlePk;
	
	public List<MemoDTO> getMemoList(int no) {
		System.out.println(no);
		return mMapper.getMemoList(no);
	}

	public MemoDTO openMemo(int no) {

		return mMapper.openMemo(no);
	}

	public int insertMemo(MemoDTO memoDTO, HttpSession hs) {
		try {

//			String fileName = memoDTO.getM_file().getOriginalFilename();

			FileInputStream serviceAccount = new FileInputStream("src/main/resources/serviceKey.json");

//			int data;
//			while ((data = serviceAccount.read()) != -1 ) {
//				System.out.print((char)data);
//			}
			if (FirebaseApp.getApps().isEmpty()) {
				FirebaseOptions options = FirebaseOptions.builder()
						.setCredentials(GoogleCredentials.fromStream(serviceAccount)).build();
				FirebaseApp.initializeApp(options);
			}

			// Firebase Storage 인스턴스 가져오기
			Storage storage = StorageOptions.newBuilder().setCredentials(GoogleCredentials.fromStream(serviceAccount))
					.build().getService();

			String saveFileName = UUID.randomUUID().toString().split("-")[0];
			System.out.println(saveFileName);
			// 업로드할 파일 경로 및 이름 설정
			String bucketName = "happybottle-13b47.appspot.com";
			String objectName = "memory/" + saveFileName;

			// 업로드할 파일 객체 생성
			BlobId blobId = BlobId.of(bucketName, objectName);
			BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType("image/jpeg").build();

			// 파일을 Firebase Storage에 업로드
			Blob blob = storage.create(blobInfo, memoDTO.getM_file().getBytes());

			System.out.println("File " + saveFileName + " uploaded successfully.");

			// 업로드한 파일의 Blob 객체에서 공개적인 URL 가져오기
			String publicUrl = "https://firebasestorage.googleapis.com/v0/b/" + bucketName + "/o/memory%2F"
					+ saveFileName + "?alt=media";

			// 저장할 이미지 경로 - 요걸 m_pic에 insert하면 됨
			System.out.println("Public URL: " + publicUrl);
			memoDTO.setM_pic(publicUrl);
			if(memoDTO.getB_no()==0) {
				UserDTO userDTO = (UserDTO) hs.getAttribute("user");
				if(bMapper.createBottle(userDTO.getU_id())==1) {
					bottlePk = bMapper.curBottleNo();
					memoDTO.setB_no(bottlePk);
				}
			}
			
			mMapper.insertMemo(memoDTO);
			System.out.println("================ pk : " + bottlePk);
			return bottlePk;
			
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
