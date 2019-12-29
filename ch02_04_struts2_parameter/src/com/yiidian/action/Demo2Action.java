package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
import com.yiidian.domain.User;
/**
 * JavaBean属性驱动
 * @author 一点教程(yiidian.com)
 */
public class Demo2Action extends ActionSupport{
	private User user; //该对象用于接收表单的参数
	//必须提供getter和setter方法
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
