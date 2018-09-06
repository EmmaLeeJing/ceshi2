package com.domepack.webb.entity;
/**
 * 自定义返回结果集
 * @author liwei65
 *
 */
import java.io.Serializable;

public class Result<E> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String status;// 返回信息
	private String error;// 错误信息
	private E result;// 返回信息可自定义
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public E getResult() {
		return result;
	}
	public void setResult(E result) {
		this.result = result;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
