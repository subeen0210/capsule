package com.capsule.main.bottle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BottleDAO {
    @Autowired
	private BottleMapper bMapper;

	public BottleDTO getBottle(int no) {
		return bMapper.getBottle(no);
	}
}
