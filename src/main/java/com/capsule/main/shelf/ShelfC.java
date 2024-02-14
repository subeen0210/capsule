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

@RequestMapping("/happy-capsule")
@Controller
public class ShelfC {

	@Autowired
	private ShelfDAO sDAO;
	
	@GetMapping("/home")
	public String shelf(Model model) {
		model.addAttribute("content", "/WEB-INF/views/shelf/shelfContent.jsp");
		return "home";
	}
	
	@PostMapping("/shelf/list")
	public String list(@RequestParam("id") String id, Model model) {
		System.out.println(sDAO.getShelfList(id));
		model.addAttribute("bottleList", sDAO.getShelfList(id));
		model.addAttribute("content", "/WEB-INF/views/shelf/shelfContent.jsp");
		return "home";
	}
	
	
	@GetMapping("/shelf/list/{id}")
	public @ResponseBody List<ShelfDTO> listJson(@PathVariable("id") String id, Model model) {
		System.out.println(id);
		System.out.println(sDAO.getShelfList(id));
		return sDAO.getShelfList(id);
	}
}
