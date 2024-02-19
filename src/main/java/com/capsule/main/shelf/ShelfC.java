package com.capsule.main.shelf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capsule.main.login.UserDTO;

import jakarta.servlet.http.HttpSession;

@RequestMapping("/happy-capsule")
@Controller
public class ShelfC {

	@Autowired
	private ShelfDAO sDAO;
	
	@Autowired
	private HttpSession hs;
	
	@GetMapping("/shelf")
	public String shelf(Model model) {
		UserDTO loginUser = (UserDTO) hs.getAttribute("user");
		String id = loginUser.getU_id();
		System.out.println(id);
		model.addAttribute("bottleList", sDAO.getShelfList(id));
		model.addAttribute("content", "shelf/shelfContent.jsp");
		return "home";
	}
	
	@PostMapping("/shelf/list")
	public String list(@RequestParam("id") String id, Model model, HttpSession hs) {
		
		System.out.println(hs.getAttribute("user")); 
		model.addAttribute("content", "shelf/shelfContent.jsp");
		return "home";
	}
	
	@PostMapping("/shelf/list/{id}")
	public @ResponseBody List<ShelfDTO> listJson(@PathVariable("id") String id, Model model) {
		System.out.println(id);
		System.out.println(sDAO.getShelfList(id));
		return sDAO.getShelfList(id);
	}
}
