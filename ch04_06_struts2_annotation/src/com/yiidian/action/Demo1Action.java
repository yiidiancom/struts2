package com.yiidian.action;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import com.opensymphony.xwork2.ActionSupport;
/**
 * Struts2ע�ⷽʽ����Action
 * @author һ��̳�(yiidian.com)
 */
@ParentPackage("struts-default")
@Namespace("/")
@Action(value="/demo1",results={@Result(name="success",location="/succ.jsp"),})
public class Demo1Action extends ActionSupport {
	 @Override
	public String execute() throws Exception {
		System.out.println("������action��");
		return SUCCESS;
	}
}
