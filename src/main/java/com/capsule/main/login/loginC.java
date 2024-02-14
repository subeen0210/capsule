package com.capsule.main.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/happy-capsule")
@Controller
public class loginC {
	
	@GetMapping("/login")
	public String home() {
		return "login/login";
	}
	
	@GetMapping("/login/find")
	public String findUser() {
		return "login/find";
	}
	
	@GetMapping("/join")
	public String join() {
		return "login/join";
	}

}
