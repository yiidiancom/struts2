package com.yiidian.dao.impl;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.yiidian.dao.CustomerDao;
import com.yiidian.domain.Customer;
/**
 * Daoʵ��
 * @author һ��̳�(yiidian.com)
 */
public class CustomerDaoImpl implements CustomerDao {
	//ע��Spring�ṩHibernateTemplate��
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public void save(Customer customer) {
		hibernateTemplate.save(customer);
	}

}
