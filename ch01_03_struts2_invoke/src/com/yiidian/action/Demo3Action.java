package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 方式三：动态方式调用的访问方式
 * @author 一点教程(yiidian.com)
 *
 */
public class Demo3Action extends ActionSupport{
	public String save(){
		System.out.println("Demo3Action的save方法");
		return SUCCESS;
	}
	
	public String delete(){
		System.out.println("Demo3Action的delete方法");
		return SUCCESS;
	}
}
