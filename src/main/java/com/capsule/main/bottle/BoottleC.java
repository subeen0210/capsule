package com.capsule.main.bottle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capsule.main.memo.MemoDAO;
import com.capsule.main.memo.MemoDTO;

import java.util.List;


@RequestMapping("/happy-capsule")
@Controller
public class BoottleC  {


    @Autowired
    private MemoDAO mDAO;

    @Autowired
    private BottleDAO bDAO;


    
    @GetMapping("/bottle/{no}")
	public String bottle(Model model, @PathVariable("no") int no) {
		model.addAttribute("content", "/WEB-INF/views/bottle/bottleContent.jsp");
		List<MemoDTO> memoList = mDAO.getMemoList(no);
        model.addAttribute("memoList", memoList);
		// Count the number of m_no in memoList
        int memoCount = memoList.size();
        model.addAttribute("memoCount", memoCount);
		return "home";
	}

	
}
