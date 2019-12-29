package com.yiidian.action;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yiidian.domain.User;
/**
 * Struts2转换后台数据为Json字符串
 * @author  一点教程(yiidian.com)
 */
public class Demo1Action extends ActionSupport{
	//这个userList需要转换为Json字符串格式输出到浏览器
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
			user.setName("小明"+i);
			user.setPassword("123");
			user.setEmail("xiaoming"+i+"@yiidian.com");
			user.setPhone("13211112222");
			userList.add(user);
		}
		
		return SUCCESS;
	}
}
