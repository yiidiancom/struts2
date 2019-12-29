package com.yiidian.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author һ��̳�(yiidian.com)
 */
public class Demo1Action extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// ��ȡActionContext
		ActionContext context = ActionContext.getContext();
		// 1.���ContextMap����
		context.put("hello", "һ��̳���-�����������룬רעIT�̳�");

		// 2.��ContextMap��request��������
		HttpServletRequest request = (HttpServletRequest) context.get(StrutsStatics.HTTP_REQUEST);
		request.setAttribute("rerquestMap", "requestMap������");

		// 3.��ContextMap��session��������
		context.getSession().put("sessionMap", "sessionMap������");

		// 4.��ContextMap��application��������
		context.getApplication().put("applicationMap", "applicationMap������");
		
		return SUCCESS;
	}

}
