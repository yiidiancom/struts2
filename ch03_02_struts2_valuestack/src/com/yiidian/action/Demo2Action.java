package com.yiidian.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * @author һ��̳�(yiidian.com)
 */
public class Demo2Action extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// ��ֵջ��������
		ActionContext ac = ActionContext.getContext();
		ValueStack vs = ac.getValueStack();
		// 1.�ַ���
		vs.push("С��");
		// 2.����
		vs.push(new User("С��", "Ů"));
		return SUCCESS;
	}

}
