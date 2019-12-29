package com.yiidian.action;
import com.opensymphony.xwork2.Action;
/**
 * 
 * @author 一点教程(yiidian.com)
 *
 */
public class Demo2Action implements Action{

	//execute:是struts2的Action类的默认方法
	@Override
	public String execute() throws Exception {
		System.out.println("Action第二种写法：实现Action接口");
		return SUCCESS;
	}

}