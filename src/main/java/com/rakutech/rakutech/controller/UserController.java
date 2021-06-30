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
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<User> userList = userService.list();
		model.addAttribute("listUsers", userList);
	    return "index";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		User user = new User();
//		model.addAttribute("user", user);
//		System.out.println(user);
		return "signup";
	}
	
	@RequestMapping("/signin")
	public String signin(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "signin";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) {
//		System.out.println(user);
		userService.save(user);
	    return "redirect:/";
	}
	
	@RequestMapping(value="/get", method = RequestMethod.POST)
	public String loginUser(@ModelAttribute("user") User user) {
		System.out.println(userService.getByEmail(user.getEmail()));
		
	    return "redirect:/";
	}
	
}
