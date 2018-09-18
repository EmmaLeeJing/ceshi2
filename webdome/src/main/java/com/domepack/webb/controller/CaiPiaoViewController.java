package com.domepack.webb.controller;
/***
 * Ò³ÃæÌø×ªµÄcontroller
 */
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domepack.webb.entity.CaiPiaoNum;

@Controller  
@RequestMapping("/caiview")  
public class CaiPiaoViewController {

	private final static String USERLIST="/cai/index";
	
	
	private final static String USERADD="/cai/add";
	
	
	
	
	@RequestMapping(value="/index",method=RequestMethod.GET)  
    public String users(HttpServletRequest request,Model model){  
		return USERLIST;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)  
    public String addUsers(HttpServletRequest request,Model model){  
		return USERADD;
	}
	
	@RequestMapping(value="/saveCai",method=RequestMethod.GET)  
    public String saveCaiPiao(HttpServletRequest request,CaiPiaoNum caipiao){  
		return USERADD;
	}
}
