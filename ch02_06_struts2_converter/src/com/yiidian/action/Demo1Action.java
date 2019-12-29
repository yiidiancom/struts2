package com.yiidian.action;
import java.util.Date;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author 一点教程(yiidian.com)
 */
public class Demo1Action extends ActionSupport{
	//struts2可以自动类型转换
	private String userName;
	private String userPwd;
	private String email;
	private Integer age;
	private Double result;
	private Date birth;//Struts2默认不支持日期类型转换，需要自定义类型转换器
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setResult(Double result) {
		this.result = result;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(userName);
		System.out.println(userPwd);
		System.out.println(email);
		System.out.println(age);
		System.out.println(result);
		System.out.println(birth);
		return SUCCESS;
	}
	
}
