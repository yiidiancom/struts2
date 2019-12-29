package com.yiidian.domain;
import java.io.Serializable;
/**
 * @author һ��̳�(yiidian.com)
 */
public class User implements Serializable{
	private String userName;
	private String userPwd;
	private String email;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPwd=" + userPwd
				+ ", email=" + email + "]";
	}
}
