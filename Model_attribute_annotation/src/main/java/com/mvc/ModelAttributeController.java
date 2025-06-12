package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModelAttributeController {

	@RequestMapping("/login")
	public String printDetails(@RequestParam("uid") int id,@RequestParam("uname") String name,@RequestParam("email") String em,@RequestParam("password") String pass, Model m) {
		
		m.addAttribute("userId",id);
		m.addAttribute("userName",name);
		m.addAttribute("userEmail",em);
		m.addAttribute("userPass",pass);

		return "PrintLoginDetails";
	}
	
}
