package com.domepack.webb.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;



public abstract  class AbstractController{

	protected String nullView() {
		return null;
	}

	
	/* JSON视图，在前端用ajaxForm提交表单时使用（修复IE提示JSON保存的问题） */
	protected String jsonView(HttpServletResponse response, String jsonStr) {
		try {
			//String jsonString = JsonUtil.getJSONString(jsonStr);
			response.setContentType("text/html;charset=" + "UTF8");
			PrintWriter writer = response.getWriter();
			writer.print(jsonStr);
		} catch (Exception e) {
			throw new RuntimeException("Writer json string exception.", e);
		}

		return nullView();
	}
	

}
