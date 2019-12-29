package com.yiidian.action;
import java.io.File;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 接收文件和参数
 * @author 一点教程(yiidian.com)
 */
public class Demo1Action extends ActionSupport{
	//接收表单普通参数
	private String name;
	private String password;
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//接收文件信息
	private File icon; //内容
	private String iconFileName;//名称
	private String iconContentType;//类型
	public void setIcon(File icon) {
		this.icon = icon;
	}
	public void setIconFileName(String iconFileName) {
		this.iconFileName = iconFileName;
	}
	public void setIconContentType(String iconContentType) {
		this.iconContentType = iconContentType;
	}
	
	@Override
	public String execute() throws Exception {	
		System.out.println("name="+name);
		System.out.println("password="+password);
		System.out.println("文件内容--"+icon);
		System.out.println("文件名称--"+iconFileName);
		System.out.println("文件类型--"+iconContentType);	
		return SUCCESS;
	}
}
