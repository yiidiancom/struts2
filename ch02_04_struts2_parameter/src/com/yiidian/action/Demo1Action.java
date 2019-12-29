package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 普通属性驱动
 * @author 一点教程(yiidian.com)
 */
public class Demo1Action extends ActionSupport{
	//提供setter方法
	private String userName;
	private String userPwd;
	private String email;
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(userName);
		System.out.println(userPwd);
		System.out.println(email);
		return SUCCESS;
	}
	
}
