package com.capsule.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HC {

	@GetMapping("/happy-capsule")
	public String home() {
		return "index";
	}
}
