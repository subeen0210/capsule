package com.capsule.main.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	LoginMapper loginMapper;

	public void checkLogin(String u_id, String u_pw) {
		loginMapper.checkLogin(u_id);
	}

	public int signUp(UserDTO userDTO) {
		return loginMapper.signUp(userDTO);
	}

	public UserDTO checkID(String u_id) {
		return loginMapper.checkID(u_id);

	}

	public UserDTO checkMail(String u_email) {
		return loginMapper.checkMail(u_email);
	}

}
