package com.capsule.main.login;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	private SqlSession ss;

	@Autowired
	LoginMapper loginMapper;

	public void checkLogin(UserDTO userDTO) {

	}

	public void signUp(UserDTO userDTO) {
		if (loginMapper.signUp(userDTO) == 1) {
			System.out.println("가입 성공");
		}
		;

	}

}
