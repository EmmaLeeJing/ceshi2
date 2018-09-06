package com.domepack.webb.untils;

import com.domepack.webb.entity.Result;


public class ResultUtil {
	/**
	 * 返回正确操作信息
	 * @return
	 */
	public static  Result<String>   getRight(){
		Result<String> response =new  Result<String>();
		response.setError(null);
		response.setStatus("1");
		response.setResult("1");
	    return response;  
	}
	/**
	 * 返回正确的返回结果
	 * @return
	 */
	public static  Result<Object>   getRightObject(){
		Result<Object> response =new  Result<Object>();
		response.setError(null);
		response.setStatus("1");
		response.setResult("1");
	    return response;  
	}
	/**
	 * 返回错误操作信息
	 * @return
	 */
	public static  Result<String>   getError(String str){
		Result<String> response =new  Result<String>();
		response.setError(str);
		response.setStatus("0");
	    response.setResult("0");
	    return response;  
	}
	
	/**
	 * 返回错误操作结果
	 * @return
	 */
	public static  Result<Object>   getErrorObject(String str){
		Result<Object> response =new  Result<Object>();
		response.setError(str);
		response.setStatus("0");
	    response.setResult("0");
	    return response;  
	}
}
