package com.domepack.webb.untils;

public class WebUtils {
	/**
	 * �ж��Ƿ�Ϊ�գ�Ϊ�շ���true
	 * 
	 * @return
	 */
	public static boolean isStrEmpty(String words) {
		if (words==null) {
			return true;
		}
		if (words.isEmpty()) {
			return words.isEmpty();
		}
		return false;
	}


}
