package com.yiidian.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiidian.domain.Customer;
import com.yiidian.service.CustomerService;
/**
 * 一点教程(yiidian.com)
 */
public class TestSpringHibernate {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
		CustomerService customerService = (CustomerService)ac.getBean("customerService");
		Customer cust = new Customer();
		cust.setCustName("李四");
		cust.setCustPhone("020-44444444");
		cust.setCustAddress("广州-一点教程网");
		customerService.save(cust);
	}
}
