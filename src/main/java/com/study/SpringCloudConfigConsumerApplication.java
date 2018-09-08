package com.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class SpringCloudConfigConsumerApplication {

	@Value("${name}")
	private String name;
	
	@Value("${greeting}")
	private String greeting;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigConsumerApplication.class, args);
	}
	
	@RequestMapping(value="/greeting", method=RequestMethod.GET)
	public String getCustomisedGreetingFromCloud(Model model) {
		System.out.println(name + "and" + greeting);
		model.addAttribute("name", name);
		model.addAttribute("greeting", greeting);
		return "greeting";
	}
}
