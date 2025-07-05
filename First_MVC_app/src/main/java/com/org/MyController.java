package com.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/add")
	public String addDemo() {
		
		return "about";
		
	}
	
	@RequestMapping("/sub")
	public String subDemo() {
		
		return "contact";
		
	}
	
	@RequestMapping("/mult")
	public String multDemo() {
		
		return "help";
		
	}
	
}
