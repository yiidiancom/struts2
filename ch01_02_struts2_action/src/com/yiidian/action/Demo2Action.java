package com.yiidian.action;
import com.opensymphony.xwork2.Action;
/**
 * 
 * @author һ��̳�(yiidian.com)
 *
 */
public class Demo2Action implements Action{

	//execute:��struts2��Action���Ĭ�Ϸ���
	@Override
	public String execute() throws Exception {
		System.out.println("Action�ڶ���д����ʵ��Action�ӿ�");
		return SUCCESS;
	}

}