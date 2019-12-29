package com.yiidian.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yiidian.service.CustomerService;
/**
 * 一点教程(yiidian.com)
 */
public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
		CustomerService customerService = (CustomerService)ac.getBean("customerService");
		customerService.save(null);
	}
}
