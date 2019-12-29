package com.yiidian.domain;
import java.io.Serializable;
/**
 * 用户实体
 * @author 一点教程(yiidian.com)
 */
public class Customer implements Serializable{

	private Long id;
	private String custName;
	private String custPhone;
	private String custAddress;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	
}