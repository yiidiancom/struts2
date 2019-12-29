package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
public class DemoAction extends ActionSupport {

	public String save() {
		System.out.println("DemoAction的save方法");
		return SUCCESS;
	}

	public String list() {
		System.out.println("DemoAction的list方法");
		return SUCCESS;
	}
}
