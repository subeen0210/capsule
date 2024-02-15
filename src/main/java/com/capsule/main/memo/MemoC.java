package com.capsule.main.memo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/happy-capsule")
@Controller
public class MemoC {

    @Autowired
	private MemoDAO mDAO;

    
    @GetMapping("/open/{no}")
	public String bottleOpen(Model model, @PathVariable("no") int no) {
		model.addAttribute("content", "/WEB-INF/views/memo/bottleOpen.jsp");
        System.out.println(mDAO.getMemoList(no));

		return "home";
	}
    
}
