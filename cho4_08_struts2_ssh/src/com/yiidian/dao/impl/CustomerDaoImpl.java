package com.yiidian.dao.impl;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.yiidian.dao.CustomerDao;
import com.yiidian.domain.Customer;
/**
 * Dao实现
 * @author 一点教程(yiidian.com)
 */
public class CustomerDaoImpl implements CustomerDao {
	//注入Spring提供HibernateTemplate类
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public void save(Customer customer) {
		hibernateTemplate.save(customer);
	}

}
