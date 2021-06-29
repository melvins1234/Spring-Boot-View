package com.rakutech.rakutech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rakutech.rakutech.entities.User;
import com.rakutech.rakutech.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/signup")
	public String signup(Model model) {
		User user = new User();
		model.addAttribute(user);
		return "signup";
	}
	
	@RequestMapping("/")
	public String viewHomePage() {
//	    List<User> listUsers = userService.list();
//	    listUsers.forEach(e -> {
//	    	System.out.println(e.getfullName());
//	    });
//	    model.addAttribute("listUsers", listUsers);
	     
	    return "index";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) {
		System.out.println(user);
//		userService.save(user);
	    return "redirect:/";
	}
	
}
