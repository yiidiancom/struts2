package com.yiidian.action;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.StrutsStatics;
import org.apache.struts2.dispatcher.HttpParameters;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ʹ��ActionContext��
 * @author һ��̳�(yiidian.com)
 *
 */
public class Demo2Action extends ActionSupport{

	@Override
	public String execute() throws Exception {
		//1.���ղ���
		ActionContext context = ActionContext.getContext();
		
		HttpParameters parameters = context.getParameters();
		
		String name = parameters.get("name").getValue();
		String gender = parameters.get("gender").getValue();
		String age = parameters.get("age").getValue();
		
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		
		//2.�������ݵ�ҳ��
		//2.1 request��
		HttpServletRequest request = (HttpServletRequest)context.get(StrutsStatics.HTTP_REQUEST);
		request.setAttribute("request_data", "С��");
		//2.2 session��
		context.getSession().put("session_data", "С��");
		//2.3 application��
		context.getApplication().put("application_data", "С��");
		
		return SUCCESS;
	}
}
