package com.capsule.main.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	LoginMapper loginMapper;

	public int checkLogin(String u_id, String u_pw) {
		String id = loginMapper.checkLogin(u_id).getU_id();
		String pw = loginMapper.checkLogin(u_id).getU_pw();

		if (u_id.equals(id)) {
			if (u_pw.equals(pw)) {
				System.out.println("로그인 성공");
				return 1;
			} else {
				System.out.println("비밀번호 오류");
				return 0;
			}
		}
		return 0;

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
