package com.capsule.main.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;

@Service
public class LoginService {

	@Autowired
	LoginMapper loginMapper;

	public int checkLogin(String u_id, String u_pw, HttpSession hs) {
		System.out.println(u_id);
		String id = loginMapper.checkLogin(u_id).getU_id();
		UserDTO user = loginMapper.checkLogin(u_id);

		if (u_id.equals(id)) {
			if (u_pw.equals(user.getU_pw())) {
				System.out.println("로그인 성공");
				hs.setAttribute("user", user);
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
