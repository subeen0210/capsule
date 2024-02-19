package com.capsule.main.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@RequestMapping("/happy-capsule")
@Controller
public class HomeC {

	
	@GetMapping("/main")
	public String makeMemoGO(Model model, HttpSession hs) {
		System.out.println(hs.getAttribute("user"));
		model.addAttribute("content", "/WEB-INF/views/home/homeContent.jsp");
		return "home";
	}
	
}
