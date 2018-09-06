package com.domepack.webb.untils;

public class WebUtils {
	/**
	 * 判断是否为空，为空返回true
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
