package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
import com.yiidian.domain.User;
/**
 * JavaBean��������
 * @author һ��̳�(yiidian.com)
 */
public class Demo2Action extends ActionSupport{
	private User user; //�ö������ڽ��ձ��Ĳ���
	//�����ṩgetter��setter����
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}	
	@Override
	public String execute() throws Exception {
		System.out.println(user);
		return SUCCESS;
	}
}
