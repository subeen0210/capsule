package com.capsule.main.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/happy-capsule")
@Controller
public class loginC {

	@Autowired
	private LoginService loginService;

	@GetMapping("/login")
	public String home() {
		return "login/login";
	}

	// 로그인 로직 수행
	// 유저가 입력한 값이 일치하는지 확인
	// 일치 시 메인 홈으로 이동
	@PostMapping("/login")
	public String login(@RequestParam String u_id, @RequestParam String u_pw) {
		if (loginService.checkLogin(u_id, u_pw) == 1) {
			return "redirect:/happy-capsule/home";
		} else {
			System.out.println("로그인 실패");
			return "redirect:/happy-capsule/login";
		}
	}

	@GetMapping("/login/find")
	public String findUser() {
		return "login/find";
	}

	@GetMapping("/join")
	public String goJoin() {
		return "login/join";
	}

	// 회원가입하는 로직
	// insert해 주고 login 페이지로 이동
	@PostMapping("/join")
	public String join(UserDTO userDTO) {
		loginService.signUp(userDTO);
		return "redirect:/happy-capsule/login";
	}

	@ResponseBody
	@GetMapping("/join/checkID")
	public UserDTO checkID(@RequestParam String u_id) {
		return loginService.checkID(u_id);
	}

	@ResponseBody
	@GetMapping("/join/checkMail")
	public UserDTO checkMail(@RequestParam String u_email) {
		return loginService.checkMail(u_email);
	}

}
