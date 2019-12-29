package com.yiidian.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yiidian.domain.Customer;
import com.yiidian.service.CustomerService;

/**
 * Action��
 * 
 * @author һ��̳�(yiidian.com)
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}


	//ģ���������ձ�����
	private Customer customer = new Customer();
	
	
	public String save() {

		// ʹ��Spring��web��������ȡ������Ϣ
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
