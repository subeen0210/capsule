package com.capsule.main.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capsule.main.login.UserDTO;
import com.capsule.main.memo.MemoDAO;
import com.capsule.main.memo.MemoDTO;

import jakarta.servlet.http.HttpSession;

@RequestMapping("/happy-capsule")
@Controller
public class HomeC {

	@Autowired
	private MemoDAO mDAO;
	
	@Autowired
	private HttpSession hs;

	@GetMapping("/main")
	public String makeMemoGO(Model model) {
		UserDTO loginUser = (UserDTO) hs.getAttribute("user");
		System.out.println(loginUser);
		model.addAttribute("user", loginUser);
		model.addAttribute("content", "/WEB-INF/views/home/homeContent.jsp");
		return "home";
	}

//	@PostMapping("/write")
//	public String insertMemo(MemoMultiDTO multiDTO) {
//		mDAO.insertMemo(multiDTO, hs);
//		return "redirect:/happy-capsule/main";
//	}
	
	@PostMapping("/write")
	public String insertMemo(MemoDTO memoDTO) {
		System.out.println(memoDTO);
		System.out.println(memoDTO.getM_file());
		mDAO.insertMemo(memoDTO);
		return "redirect:/happy-capsule/main";
	}
	
}
