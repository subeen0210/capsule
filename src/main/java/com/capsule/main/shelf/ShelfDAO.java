package com.capsule.main.shelf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.capsule.main.memo.MemoMapper;

@Service
public class ShelfDAO {
	
	@Autowired
	private ShelfMapper sMapper;
	
	@Autowired
	private MemoMapper mMapper;
	
	public List<ShelfDTO> getShelfList(String id) {
		return sMapper.getShelfList(id);
	}
	
	public List<ShelfDTO> getJsonList(String id) {
		List<ShelfDTO> bottles = sMapper.getShelfList(id);
		for (ShelfDTO bottle : bottles) {
			bottle.setMemos(sMapper.getBottleMemo(bottle.getB_no()));
		}
		
        // 하나의 병이 메모들을 가지고 있음
		// 그럼 하나의 병을 가져올때 그 안에 해당하는메모들을 다 불러온 상태로 병을 부르는 방법
		// 병들을 싹다 가져온다음에 그병들을반복문 돌려서 하나의 병에 해당하는 바퀴일때 그 메모들 다 채우기
		
		
		
		// 모든 병들을 가져오면서 그 안에 메모들까지도 가져올것.
		
		// 병만 다 가져오기.
		// 가장 최근의 병 하나만 메모들 세팅
		// 다른 병 클릭하면 비동기로 그 pk해당 병의 메모들 가져오
        
        return bottles;
	}

	public void getFirstBottle(Model model, String id) {
		System.out.println(id);
		int no = sMapper.getFirstBottle(id);
		int memoCount = mMapper.countMemo(no);
		model.addAttribute("memoCount", memoCount);
	}
	
//	public void selectFirstBottle() {
//		sMapper.selectFirstBottle();
//	}
	
	
}
