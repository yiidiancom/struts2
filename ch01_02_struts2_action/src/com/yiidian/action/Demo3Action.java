package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @author 一点教程(yiidian.com)
 *
 */
public class Demo3Action extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("第三种写法：继承ActionSupport类");
		return SUCCESS;
	}

}