package com.yiidian.action;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 使用ServletActionContext类
 * @author 一点教程(yiidian.com)
 *
 */
public class Demo1Action extends ActionSupport{

	@Override
	public String execute() throws Exception {
		//1.接收参数
		HttpServletRequest request = ServletActionContext.getRequest();
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		
		//2.共享数据到页面
		//2.1 request域
		request.setAttribute("request_data", "小苍");
		//2.2 session域
		request.getSession().setAttribute("session_data", "小风");
		//2.3 application域（ServletContext）
		ServletActionContext.getServletContext().setAttribute("application_data", "小泽");
		
		return SUCCESS;
	}
	
}
