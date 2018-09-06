package com.domepack.webb.untils;

import com.domepack.webb.entity.Result;


public class ResultUtil {
	/**
	 * ������ȷ������Ϣ
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
	 * ������ȷ�ķ��ؽ��
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
	 * ���ش��������Ϣ
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
	 * ���ش���������
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
