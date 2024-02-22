package com.capsule.main.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

	
	@ResponseBody
	@PostMapping("/write")
	public int insertMemo(MemoDTO memoDTO, HttpSession hs) {
		return 	mDAO.insertMemo(memoDTO, hs);
	}
	
	
////	@PostMapping("/write")
////	public String insertMemo(MemoMultiDTO multiDTO) {
////		mDAO.insertMemo(multiDTO, hs);
////		return "redirect:/happy-capsule/main";
////	}
//	
//	@PostMapping("/write/{no}")
//	public String insertMemo(MemoMultiDTO memoDTO, @PathVariable("no") int no) {
//		mDAO.insertMemo(memoDTO, no);
//		
////		String originalFileName = file.getOriginalFilename();
////		File path = new File("" + originalFileName);
//		
//		return "redirect:/happy-capsule/main";
//	}
	
}
