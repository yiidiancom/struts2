package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author 一点教程(yiidian.com)
 */
public class Demo1Action extends ActionSupport{
	@Override
	public String execute() throws Exception {
		//获取国际化资源文件信息
		String user = this.getText("user");
		System.out.println(user);	
		return SUCCESS;
	}
}
