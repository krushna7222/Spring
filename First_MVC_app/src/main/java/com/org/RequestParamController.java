package com.org;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamController {

	/*
	//without @RequestParam annotation
	
	@RequestMapping("/addition")
	public String addData(HttpServletRequest req) {
		
		int a = Integer.parseInt(req.getParameter("n1"));
		int b = Integer.parseInt(req.getParameter("n2"));

		int c = a+b;
		
		System.out.println("Add = " +c);
		
		return "addDataPage";
	}
	*/
	
	//with @RequestParam annotation
	
		@RequestMapping("/addition")
		public String addData(@RequestParam("n1") int a,@RequestParam("n2") int b ,Model model) {
			
			
			int c = a+b;
			
            model.addAttribute("sum", c);
            
            System.out.println("Addition = "+c);
			
			return "addDataPage";
		}
		
		//sending data from  Controller to view using : ModelAndView class
        @RequestMapping("/addData2")
        public ModelAndView addDemo2(@RequestParam("n1") int a, @RequestParam("n2") int b ) 
        {
            ModelAndView mv = new ModelAndView();
            
                 int c =a+b;
             
                mv.addObject("sum", c);
                mv.setViewName("addData2"); 
                
             System.out.println("add  = "+c);
             
             return mv;
        }
}
