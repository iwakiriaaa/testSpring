package com.example.demo.controller;

import java.util.List;

import javax.xml.stream.events.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org. springframework.validation. annotation. Validated;
import org. springframework.web.bind.annotation.GetMapping;
import org. springframework.web.bind.annotation.ModelAttribute;
import org. springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.SyainEntityClass;
import com.example.demo.model.SyozokuEntityClass;
import com.example.demo.service.UserService;

@Controller
public class MainController {
	
    @Autowired
    UserService userService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String displayList(Model model) {	   
		List<SyozokuEntityClass> userlist = userService.searchAll();
		
		if (userlist.size() > 0) {
			model.addAttribute("testtext", "結果あり");
			model.addAttribute("userlist", userlist);
		} else {
			model.addAttribute("testtext", "結果なし");
		}
		
		return "view";
	 }
}

