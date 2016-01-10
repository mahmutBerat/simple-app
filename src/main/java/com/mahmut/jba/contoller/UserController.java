package com.mahmut.jba.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mahmut.jba.service.UserService;


@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/users", method = RequestMethod.GET)
	public String users(Model model){
		model.addAttribute("users", userService.findAll() );
		
		return "users";
	}
	
}
