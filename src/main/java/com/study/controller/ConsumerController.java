package com.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConsumerController {
	
	@Value("${name}")
	private String name;
	
	@Value("${greeting}")
	private String greeting;
	
	@RequestMapping(value="/greeting", method=RequestMethod.GET)
	public String getCustomisedGreetingFromCloud(Model model) {
		System.out.println(name + "and" + greeting);
		model.addAttribute("name", name);
		model.addAttribute("greeting", greeting);
		return "greeting";
	}

}
