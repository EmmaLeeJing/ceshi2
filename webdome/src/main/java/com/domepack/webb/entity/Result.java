package com.domepack.webb.entity;
/**
 * �Զ��巵�ؽ����
 * @author liwei65
 *
 */
import java.io.Serializable;

public class Result<E> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String status;// ������Ϣ
	private String error;// ������Ϣ
	private E result;// ������Ϣ���Զ���
	
	
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
