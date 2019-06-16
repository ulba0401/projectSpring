package com.scnu.cnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import word.WordServiceImpl;

@Controller
public class WordController {
	
	@Autowired WordServiceImpl service;
	
	@RequestMapping(value="/wordselect", method= {RequestMethod.GET, RequestMethod.POST})
	public String selectAllList(Model model, @RequestParam String methode) {
		System.out.println("wordListConn Succ");
		System.out.println(methode);
		
		model.addAttribute("wlist", service.selectAllList(methode) );
		
		System.out.println(service.selectAllList(methode).size());
		
		return "word/allSelectList";
	}

}
