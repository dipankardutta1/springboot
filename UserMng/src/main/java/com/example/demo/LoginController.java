package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login")
	public String goToLoginPage() {
		
		
		return "page.jsp";
		
	}
	
	
	@RequestMapping(value="/validatelogin",method=RequestMethod.POST)
	public String validatelogin(@RequestParam("username")  String username,@RequestParam("password") String password) {
		
		if(username.equals(password)) {
			return "dashboard.jsp";
		}else {
			return "page.jsp";
		}
		
		
		
	}
	

}
