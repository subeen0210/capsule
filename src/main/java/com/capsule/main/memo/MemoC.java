package com.capsule.main.memo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/happy-capsule")
@Controller
public class MemoC {

    @Autowired
	private MemoDAO mDAO;

    
    @GetMapping("/open/{no}")
	public String bottleOpen(Model model, @PathVariable("no") int no) {
		model.addAttribute("content", "/WEB-INF/views/memo/bottleOpen.jsp");
		System.out.println(no);
		System.out.println(mDAO.getMemoList(no));
        model.addAttribute("memoList", mDAO.getMemoList(no));


		return "home";
	}

	@ResponseBody
	@GetMapping("/open/memo/{no}")
	public MemoDTO memoOpen(Model model, @PathVariable("no") int no) {
		


		return mDAO.openMemo(no);
	}

    
}
