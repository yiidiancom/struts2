package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yiidian.domain.User;
/**
 * ģ������
 * @author һ��̳�(yiidian.com)
 */
public class Demo3Action extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	//�ṩģ�Ͷ���
	@Override
	public User getModel() {
		return user;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(user);
		return SUCCESS;
	}
	
}
