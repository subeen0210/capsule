package com.capsule.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HC {

	@GetMapping("/happy-capsule")
	public String home() {
		return "index";
	}
}
