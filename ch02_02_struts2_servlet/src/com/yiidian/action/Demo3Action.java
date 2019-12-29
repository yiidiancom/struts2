package com.yiidian.action;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 使用接口注入方式
 * @author 一点教程(yiidian.com)
 *
 */
public class Demo3Action extends ActionSupport implements ServletRequestAware,ServletContextAware{
	private HttpServletRequest request;
	private ServletContext application;
	@Override
	public String execute() throws Exception {
		//1.接收参数
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
	
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		
		//2.共享数据到页面
		request.setAttribute("request_data", "小苍");
		request.getSession().setAttribute("session_data", "小风");
		application.setAttribute("application_data", "小泽");
		
		return SUCCESS;
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	@Override
	public void setServletContext(ServletContext context) {
		this.application = context;
	}
}
