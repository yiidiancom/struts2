package com.yiidian.service.impl;
import com.yiidian.dao.CustomerDao;
import com.yiidian.domain.Customer;
import com.yiidian.service.CustomerService;
/**
 * Serviceʵ��
 * @author һ��̳�(yiidian.com)
 */
public class CustomerServiceImpl implements CustomerService {
	//ע��CustomerDao
	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}
}
