package com.capsule.main.shelf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/happy-capsule")
@Controller
public class ShelfC {

	@GetMapping("/shelf")
	public String shelf(Model model) {
		model.addAttribute("content", "/WEB-INF/views/shelf/shelfContent.jsp");
		return "home";
	}
}
