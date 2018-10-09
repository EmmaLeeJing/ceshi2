package com.domepack.webb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.domepack.webb.entity.Result;
import com.domepack.webb.entity.User;
import com.domepack.webb.entity.UserAdmin;
import com.domepack.webb.service.UserAdminService;
import com.domepack.webb.untils.FinalValues;
import com.domepack.webb.untils.ResultUtil;
  
  
@Controller  
@RequestMapping("/user")  
public class UserController extends AbstractController {  
    private static Logger log=LoggerFactory.getLogger(UserController.class);
    
    @Autowired
    UserAdminService userAdminService;
    
    // /user/test?id=1
    @RequestMapping(value="/test",method=RequestMethod.GET)  
    public String test(HttpServletRequest request,HttpServletResponse response,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        System.out.println("userId:"+userId);
        User user=null;
    	List<User> admins= new ArrayList<User>();
    	for (int i = 0; i < 5; i++) {
    		user = new User();
    		user.setUserName("张"+i);
    		user.setPassword("123456");
    		admins.add(user);
		}
        log.debug(user.toString());
        model.addAttribute("user", user);  
        return jsonView(response,JSON.toJSONString(admins)); 
    }  
    
    @RequestMapping(value="/saveUser",method=RequestMethod.GET)  
    public @ResponseBody String saveUser(HttpServletRequest request,Model model,UserAdmin user){  
    	Result<Object> returnResult = ResultUtil.getRightObject();
        log.info("新增用户信息:username="+user.getLoginName());
        String result = userAdminService.insert(user);
        if (result.equals(FinalValues.FAIL)) {
        	returnResult = ResultUtil.getErrorObject("新增用户失败！");
		}
        return returnResult.toString();  
    } 
    
    @RequestMapping(value="/toAddUser",method=RequestMethod.GET)  
    public ModelAndView  toAddUser(HttpServletRequest request,Model model){  
    	ModelAndView mav = new ModelAndView();
    	mav.setViewName("addUser");
        return mav;  
    } 
    @RequestMapping(value="/listUser",method=RequestMethod.GET)  
    public @ResponseBody String listUser(HttpServletRequest request,HttpServletResponse response,UserAdmin user){ 
    	Result<Object> returnResult = ResultUtil.getRightObject();
    	UserAdmin usera= null;
    	List<UserAdmin> admins= userAdminService.userList(user);
    	for (int i = 0; i < 5; i++) {
    		usera = new UserAdmin();
    		usera.setLoginName("张"+i);
    		usera.setPassword("123456");
    		admins.add(usera);
		}
    	returnResult.setResult(admins);
        return jsonView(response,JSON.toJSONString(returnResult));  
    } 
    
    
}