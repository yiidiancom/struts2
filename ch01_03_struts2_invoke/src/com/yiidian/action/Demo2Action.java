package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
/**
 * ��ʽ����ͨ����ķ��ʷ�ʽ
 * @author һ��̳�(yiidian.com)
 *
 */
public class Demo2Action extends ActionSupport{

	public String save(){
		System.out.println("Demo2Action��save����");
		return SUCCESS;
	}
	
	
	public String delete(){
		System.out.println("Demo2Action��delete����");
		return SUCCESS;
	}
}
