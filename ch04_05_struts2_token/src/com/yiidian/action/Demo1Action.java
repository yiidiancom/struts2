package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
/**
 * ��ֹ���ظ��ύ
 * @author  һ��̳�(yiidian.com)
 */
public class Demo1Action extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("ִ��ע�����");
		return SUCCESS;
	}
}
