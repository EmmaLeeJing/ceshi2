package com.domepack.webb.controller;
/***
 * Ò³ÃæÌø×ªµÄcontroller
 */
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  
@RequestMapping("/view")  
public class IndexController {

	private final static String USERLIST="/user/index";
	
	
	private final static String USERADD="/user/addUser";
	
	
	private final static String CLASSLIST="/classes/index";
	
	
	@RequestMapping(value="/users",method=RequestMethod.GET)  
    public String users(HttpServletRequest request,Model model){  
		return USERLIST;
	}
	
	@RequestMapping(value="/addUsers",method=RequestMethod.GET)  
    public String addUsers(HttpServletRequest request,Model model){  
		return USERADD;
	}
}
