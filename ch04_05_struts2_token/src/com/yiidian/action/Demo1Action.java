package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 防止表单重复提交
 * @author  一点教程(yiidian.com)
 */
public class Demo1Action extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("执行注册操作");
		return SUCCESS;
	}
}
