package com.yiidian.action;
import java.util.Date;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author һ��̳�(yiidian.com)
 */
public class Demo1Action extends ActionSupport{
	//struts2�����Զ�����ת��
	private String userName;
	private String userPwd;
	private String email;
	private Integer age;
	private Double result;
	private Date birth;//Struts2Ĭ�ϲ�֧����������ת������Ҫ�Զ�������ת����
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
