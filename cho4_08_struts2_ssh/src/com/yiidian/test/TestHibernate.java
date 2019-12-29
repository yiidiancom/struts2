package com.yiidian.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.yiidian.domain.Customer;
/**
 * 一点教程(yiidian.com)
 */
public class TestHibernate {
	public static void main(String[] args) {
		// 1.加载hibernate.cfg.xml
		Configuration cfg = new Configuration();
		cfg.configure();

		// 2.创建SessoinFactory
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// 3.开启Session
		Session session = sessionFactory.getCurrentSession();

		// 4.开启事务
		Transaction tx = session.beginTransaction();

		// 5.保存数据
		Customer c = new Customer();
		c.setCustName("张三");
		c.setCustPhone("020-33332222");
		c.setCustAddress("一点教程网-广州");
		session.save(c);

		// 6.提交事务
		tx.commit();
	}
}
