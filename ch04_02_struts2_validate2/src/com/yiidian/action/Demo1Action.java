package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yiidian.domain.User;
/**
 * XML验证
 * @author 一点教程(yiidian.com)
 */
public class Demo1Action extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	@Override
	public User getModel() {
		return user;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("用户注册成功啦");
		return SUCCESS;
	}

	
	
}
