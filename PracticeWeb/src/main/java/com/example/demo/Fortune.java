package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Fortune {
	
	@RequestMapping("/")
	public String first() {
		return "input.html";
	} 
	
	@RequestMapping("/fortune")
	public ModelAndView register(@ModelAttribute RegisterBean rb, ModelAndView m) {
		m.addObject("rb",rb);
		m.setViewName("register.html");
		return m;
	}

	@RequestMapping("/finish")
	public String finish() {
		return "finish.html";
		
	}
}
