package com.yiidian.service.impl;
import com.yiidian.dao.CustomerDao;
import com.yiidian.domain.Customer;
import com.yiidian.service.CustomerService;
/**
 * Service实现
 * @author 一点教程(yiidian.com)
 */
public class CustomerServiceImpl implements CustomerService {
	//注入CustomerDao
	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}
}
