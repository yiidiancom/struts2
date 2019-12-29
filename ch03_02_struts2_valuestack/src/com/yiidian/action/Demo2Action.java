package com.yiidian.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * @author 一点教程(yiidian.com)
 */
public class Demo2Action extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// 往值栈保存数据
		ActionContext ac = ActionContext.getContext();
		ValueStack vs = ac.getValueStack();
		// 1.字符串
		vs.push("小苍");
		// 2.对象
		vs.push(new User("小泽", "女"));
		return SUCCESS;
	}

}
