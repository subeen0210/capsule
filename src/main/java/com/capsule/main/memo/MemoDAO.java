package com.capsule.main.memo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MemoDAO {
    @Autowired
	private MemoMapper mMapper;

	public List<MemoDTO> getMemoList(int no) {
		System.out.println(no);
		return mMapper.getMemoList(no);
	}

	public MemoDTO openMemo(int no) {
		
		return mMapper.openMemo(no);
	}
}
