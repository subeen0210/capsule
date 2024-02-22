package com.capsule.main.bottle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capsule.main.login.UserDTO;

import jakarta.servlet.http.HttpSession;



@Service
public class BottleDAO {
    @Autowired
	private BottleMapper bMapper;

    @Autowired
    private HttpSession hs;
    
	public BottleDTO getBottle(int no) {
		return bMapper.getBottle(no);
	}
	
	
}
