package com.scnu.cnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import user.UserServiceImpl;

@Controller
public class UserController {
	@Autowired UserServiceImpl service;
	
	@RequestMapping(value="/userselect", method= {RequestMethod.GET, RequestMethod.POST})
	public String selectUser(Model model) {
		System.out.println("userselect Succ");
		
		model.addAttribute("ulist", service.selectAllUser());
		System.out.println(service.selectAllUser().size());
		
		return "user/userSelectList";
	}

}
