package com.capsule.main.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

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
	@ResponseBody
	@PostMapping("/login")
<<<<<<< HEAD
	public String login(@RequestParam String u_id, @RequestParam String u_pw, HttpSession hs) {
		if (loginService.login(u_id, u_pw, hs).equals("success")) {
			return "success";
=======
	public String login(@RequestParam("u_id") String u_id, @RequestParam("u_pw") String u_pw, HttpSession hs) {
		if (loginService.login(u_id, u_pw, hs) == 1) {
			return "1";
>>>>>>> dev
		} else {
			return "false";
		}
	}

	@GetMapping("/login/find")
	public String findUser() {
		return "login/find";
	}

	// 이메일로 ID/PW 찾기
	@ResponseBody
	@PostMapping("/login/find")
	public UserDTO findUser(@RequestParam("u_email") String u_email, Model model) {
		UserDTO findUser = loginService.checkMail(u_email);
		return findUser;
	}

	@GetMapping("/join")
	public String goJoin() {
		return "login/join";
	}

	// 회원가입하는 로직
	// insert해 주고 login 페이지로 이동
	// DTO가 null일 땐 join 페이지에 머물기
	@ResponseBody
	@PostMapping("/join")
	public String join(UserDTO userDTO) {
		loginService.signUp(userDTO);
		return "redirect:/happy-capsule/login";
	}

	@ResponseBody
	@GetMapping("/join/checkID")
	public UserDTO checkID(@RequestParam("u_id") String u_id) {
		return loginService.checkID(u_id);
	}

	@ResponseBody
	@GetMapping("/join/checkMail")
	public UserDTO checkMail(@RequestParam("u_email") String u_email) {
		return loginService.checkMail(u_email);
	}

}
