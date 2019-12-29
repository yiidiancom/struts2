package com.yiidian.action;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * ʹ��ServletActionContext��
 * @author һ��̳�(yiidian.com)
 *
 */
public class Demo1Action extends ActionSupport{

	@Override
	public String execute() throws Exception {
		//1.���ղ���
		HttpServletRequest request = ServletActionContext.getRequest();
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		
		//2.�������ݵ�ҳ��
		//2.1 request��
		request.setAttribute("request_data", "С��");
		//2.2 session��
		request.getSession().setAttribute("session_data", "С��");
		//2.3 application��ServletContext��
		ServletActionContext.getServletContext().setAttribute("application_data", "С��");
		
		return SUCCESS;
	}
	
}
