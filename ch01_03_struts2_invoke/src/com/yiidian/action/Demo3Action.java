package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
/**
 * ��ʽ������̬��ʽ���õķ��ʷ�ʽ
 * @author һ��̳�(yiidian.com)
 *
 */
public class Demo3Action extends ActionSupport{
	public String save(){
		System.out.println("Demo3Action��save����");
		return SUCCESS;
	}
	
	public String delete(){
		System.out.println("Demo3Action��delete����");
		return SUCCESS;
	}
}
