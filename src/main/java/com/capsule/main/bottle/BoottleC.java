package com.capsule.main.bottle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capsule.main.login.LoginService;
import com.capsule.main.memo.MemoDAO;


@RequestMapping("/happy-capsule")
@Controller
public class BoottleC  {


    @Autowired
	private BottleDAO bDAO;

    @Autowired
    private MemoDAO mDAO;
    
    @Autowired
    private LoginService loginService;
    @GetMapping("/bottle/{no}")
	public String bottle(Model model, @PathVariable int no) {
    	if(loginService.loginCheck()) {
    	mDAO.countMemo(model ,no);
		model.addAttribute("content", "/WEB-INF/views/bottle/bottleContent.jsp");
		return "home";
    	}
    	return "redirect:/happy-capsule";
	}

	
}
