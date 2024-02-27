package com.capsule.main.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;

@Service
public class LoginService {

	@Autowired
	LoginMapper loginMapper;

	@Autowired
	HttpSession hs;
	public boolean loginCheck() {
		UserDTO user = (UserDTO) hs.getAttribute("user");
		return user == null? false : true;
	}
	
	
	public String login(String u_id, String u_pw, HttpSession hs) {
		String id = loginMapper.checkLogin(u_id).getU_id();
		UserDTO user = loginMapper.checkLogin(u_id);

		if (u_id.equals(id)) {
			if (u_pw.equals(user.getU_pw())) {
				System.out.println("로그인 성공");
				hs.setMaxInactiveInterval(3600);
				hs.setAttribute("user", user);
				return "success";
			} else {
				System.out.println("비밀번호 오류");
				return "false";
			}
		}
		return "false";
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
