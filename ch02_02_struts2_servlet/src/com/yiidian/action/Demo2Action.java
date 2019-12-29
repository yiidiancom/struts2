package com.yiidian.action;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.StrutsStatics;
import org.apache.struts2.dispatcher.HttpParameters;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 使用ActionContext类
 * @author 一点教程(yiidian.com)
 *
 */
public class Demo2Action extends ActionSupport{

	@Override
	public String execute() throws Exception {
		//1.接收参数
		ActionContext context = ActionContext.getContext();
		
		HttpParameters parameters = context.getParameters();
		
		String name = parameters.get("name").getValue();
		String gender = parameters.get("gender").getValue();
		String age = parameters.get("age").getValue();
		
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		
		//2.共享数据到页面
		//2.1 request域
		HttpServletRequest request = (HttpServletRequest)context.get(StrutsStatics.HTTP_REQUEST);
		request.setAttribute("request_data", "小苍");
		//2.2 session域
		context.getSession().put("session_data", "小风");
		//2.3 application域
		context.getApplication().put("application_data", "小泽");
		
		return SUCCESS;
	}
}
