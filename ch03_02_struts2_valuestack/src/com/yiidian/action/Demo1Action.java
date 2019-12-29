package com.yiidian.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 一点教程(yiidian.com)
 */
public class Demo1Action extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// 获取ActionContext
		ActionContext context = ActionContext.getContext();
		// 1.存放ContextMap数据
		context.put("hello", "一点教程网-技术创造梦想，专注IT教程");

		// 2.往ContextMap的request存入数据
		HttpServletRequest request = (HttpServletRequest) context.get(StrutsStatics.HTTP_REQUEST);
		request.setAttribute("rerquestMap", "requestMap的数据");

		// 3.往ContextMap的session存入数据
		context.getSession().put("sessionMap", "sessionMap的数据");

		// 4.往ContextMap的application存入数据
		context.getApplication().put("applicationMap", "applicationMap的数据");
		
		return SUCCESS;
	}

}
