package com.domepack.webb.controller;

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

import com.alibaba.fastjson.JSON;
import com.domepack.webb.entity.Province;
import com.domepack.webb.service.AddressService;
  
  
@Controller  
@RequestMapping("/address")  
public class AddressController extends AbstractController {  
    private static Logger log=LoggerFactory.getLogger(AddressController.class);
    
    @Autowired
    AddressService addressService;
    
    @RequestMapping(value="/listProvince",method=RequestMethod.GET)  
    public String test(HttpServletRequest request,HttpServletResponse response,Model model,String code){  
    	List<Province> provices = addressService.listProvince(code);
        return jsonView(response,JSON.toJSONString(provices)); 
    }  
    
    
}