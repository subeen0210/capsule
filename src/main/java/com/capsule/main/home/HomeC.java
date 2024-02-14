package com.capsule.main.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/happy-capsule")
@Controller
public class HomeC {

	@GetMapping("/home")
	public String shelf(Model model) {
		model.addAttribute("content", "/WEB-INF/views/home/shelfContent.jsp");
		return "home";
	}
	
	@GetMapping("/main")
	public String makeMemoGO(Model model) {
		model.addAttribute("content", "/WEB-INF/views/home/homeContent.jsp");
		return "home";
	}
	
}
