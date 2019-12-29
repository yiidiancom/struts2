package com.yiidian.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 方式一：传统方式的配置
 * @author 一点教程(yiidian.com)
 *
 */
public class Demo1Action extends ActionSupport{

	public String save(){
		System.out.println("Demo1Action的save方法");
		return SUCCESS;
	}
	
	
	public String update(){
		System.out.println("Demo1Action的update方法");
		return SUCCESS;
	}
}

