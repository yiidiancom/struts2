package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @author һ��̳�(yiidian.com)
 *
 */
public class Demo3Action extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("������д�����̳�ActionSupport��");
		return SUCCESS;
	}

}