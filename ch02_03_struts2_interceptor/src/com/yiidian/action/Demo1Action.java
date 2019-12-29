package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 需要拦截的目标Action
 * @author 一点教程(yiidian.com)
 */
public class Demo1Action extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("目标对象-----3.Demo1Action");
		return SUCCESS;
	}
}
