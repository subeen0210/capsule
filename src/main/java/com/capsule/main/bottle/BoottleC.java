package com.capsule.main.bottle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/happy-capsule")
@Controller
public class BoottleC  {


    @Autowired
	private BottleDAO bDAO;


    
    @GetMapping("/bottle/{no}")
	public String bottle(Model model) {
		model.addAttribute("content", "/WEB-INF/views/bottle/bottleContent.jsp");
		return "home";
	}
}
