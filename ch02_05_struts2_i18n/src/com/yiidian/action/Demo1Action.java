package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author һ��̳�(yiidian.com)
 */
public class Demo1Action extends ActionSupport{
	@Override
	public String execute() throws Exception {
		//��ȡ���ʻ���Դ�ļ���Ϣ
		String user = this.getText("user");
		System.out.println(user);	
		return SUCCESS;
	}
}
