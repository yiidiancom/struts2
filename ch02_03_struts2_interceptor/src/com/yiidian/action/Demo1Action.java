package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
/**
 * ��Ҫ���ص�Ŀ��Action
 * @author һ��̳�(yiidian.com)
 */
public class Demo1Action extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("Ŀ�����-----3.Demo1Action");
		return SUCCESS;
	}
}
