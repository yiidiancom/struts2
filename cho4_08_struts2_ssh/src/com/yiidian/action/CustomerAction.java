package com.yiidian.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yiidian.domain.Customer;
import com.yiidian.service.CustomerService;

/**
 * Action类
 * 
 * @author 一点教程(yiidian.com)
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}


	//模型驱动接收表单数据
	private Customer customer = new Customer();
	
	
	public String save() {

		// 使用Spring的web监听器读取配置信息
		WebApplicationContext ac = WebApplicationContextUtils
				.getWebApplicationContext(ServletActionContext
						.getServletContext());
		customerService = (CustomerService) ac.getBean("customerService");
		customerService.save(customer);

		return SUCCESS;
	}


	@Override
	public Customer getModel() {
		return customer;
	}
}
