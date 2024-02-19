package com.capsule.main.memo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;



@Service
public class MemoDAO {
    @Autowired
	private MemoMapper mMapper;

	public List<MemoDTO> getMemoList(int no) {
		return mMapper.getMemoList(no);
	}

//	public int insertMemo(MemoMultiDTO multiDTO, HttpSession hs) {
//		return mMapper.insertMemo(multiDTO, hs);
//	}


	
}
