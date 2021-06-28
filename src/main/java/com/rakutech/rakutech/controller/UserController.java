package com.rakutech.rakutech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rakutech.rakutech.entities.User;
import com.rakutech.rakutech.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/signup")
	public String signup() {
//		System.out.println(userService.list());
		return "signup.html";
	}
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    List<User> listUsers = userService.list();
	    System.out.println("sample" + listUsers.toString());
	    model.addAttribute("listUsers", listUsers);
	     
	    return "index";
	}
	
}
