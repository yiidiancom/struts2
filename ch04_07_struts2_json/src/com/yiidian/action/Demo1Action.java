package com.yiidian.action;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yiidian.domain.User;
/**
 * Struts2ת����̨����ΪJson�ַ���
 * @author  һ��̳�(yiidian.com)
 */
public class Demo1Action extends ActionSupport{
	//���userList��Ҫת��ΪJson�ַ�����ʽ����������
	private List<User> userList;
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	@Override
	public String execute() throws Exception {
		userList = new ArrayList<User>();
		for(int i = 1;i<=5;i++){
			User user = new User();
			user.setName("С��"+i);
			user.setPassword("123");
			user.setEmail("xiaoming"+i+"@yiidian.com");
			user.setPhone("13211112222");
			userList.add(user);
		}
		
		return SUCCESS;
	}
}
