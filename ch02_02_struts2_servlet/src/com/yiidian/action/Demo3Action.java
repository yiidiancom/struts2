package com.yiidian.action;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ʹ�ýӿ�ע�뷽ʽ
 * @author һ��̳�(yiidian.com)
 *
 */
public class Demo3Action extends ActionSupport implements ServletRequestAware,ServletContextAware{
	private HttpServletRequest request;
	private ServletContext application;
	@Override
	public String execute() throws Exception {
		//1.���ղ���
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
	
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		
		//2.�������ݵ�ҳ��
		request.setAttribute("request_data", "С��");
		request.getSession().setAttribute("session_data", "С��");
		application.setAttribute("application_data", "С��");
		
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
