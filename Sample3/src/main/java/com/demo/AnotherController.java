package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnotherController {
	 

     @RequestMapping("/about")
     public String show1()
        {
       	 return "AboutUs";
        }
     

}
