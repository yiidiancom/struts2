package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
public class DemoAction extends ActionSupport {

	public String save() {
		System.out.println("DemoAction��save����");
		return SUCCESS;
	}

	public String list() {
		System.out.println("DemoAction��list����");
		return SUCCESS;
	}
}
