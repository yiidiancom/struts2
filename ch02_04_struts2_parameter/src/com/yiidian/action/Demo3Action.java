package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yiidian.domain.User;
/**
 * 模型驱动
 * @author 一点教程(yiidian.com)
 */
public class Demo3Action extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	//提供模型对象
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
