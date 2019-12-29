package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 方式二：通配符的访问方式
 * @author 一点教程(yiidian.com)
 *
 */
public class Demo2Action extends ActionSupport{

	public String save(){
		System.out.println("Demo2Action的save方法");
		return SUCCESS;
	}
	
	
	public String delete(){
		System.out.println("Demo2Action的delete方法");
		return SUCCESS;
	}
}
