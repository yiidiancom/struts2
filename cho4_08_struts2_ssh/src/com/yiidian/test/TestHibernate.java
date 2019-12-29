package com.yiidian.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.yiidian.domain.Customer;
/**
 * һ��̳�(yiidian.com)
 */
public class TestHibernate {
	public static void main(String[] args) {
		// 1.����hibernate.cfg.xml
		Configuration cfg = new Configuration();
		cfg.configure();

		// 2.����SessoinFactory
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// 3.����Session
		Session session = sessionFactory.getCurrentSession();

		// 4.��������
		Transaction tx = session.beginTransaction();

		// 5.��������
		Customer c = new Customer();
		c.setCustName("����");
		c.setCustPhone("020-33332222");
		c.setCustAddress("һ��̳���-����");
		session.save(c);

		// 6.�ύ����
		tx.commit();
	}
}
