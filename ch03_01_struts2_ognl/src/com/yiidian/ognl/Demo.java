package com.yiidian.ognl;

import java.util.HashMap;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

import org.junit.Test;

/**
 * Ognl���ʽ����
 * 
 * @author һ��̳�(yiidian.com)
 */
public class Demo {

	/**
	 * ����ȡֵ
	 */
	@Test
	// ȡ��root�е�����ֵ
	public void test1() throws Exception {
		// ׼��ONGLContext
		// ׼��Root
		User rootUser = new User("tom", 18);
		// ׼��Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);

		// ====ʹ��OGNL���ʽȡ������====
		// ȡ��root��user�����name����
		String name = (String) Ognl.getValue("name", oc, oc.getRoot());
		Integer age = (Integer) Ognl.getValue("age", oc, oc.getRoot());
		System.out.println(name);
		System.out.println(age);

		// ---------------------------------------------------
		// ȡ��context�м�Ϊuser1�����name����
		String name1 = (String) Ognl.getValue("#user1.name", oc, oc.getRoot());
		String name2 = (String) Ognl.getValue("#user2.name", oc, oc.getRoot());
		Integer age1 = (Integer) Ognl.getValue("#user2.age", oc, oc.getRoot());
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(age1);
	}

	/**
	 * ��ֵ
	 */
	@Test
	public void test2() throws Exception {
		// ׼��ONGLContext
		// ׼��Root
		User rootUser = new User("tom", 18);
		// ׼��Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);

		// ��дOGNL���ʽ
		// ��root�е�user�����name���Ը�ֵ
		Ognl.getValue("name='jerry'", oc, oc.getRoot());
		String name = (String) Ognl.getValue("name", oc, oc.getRoot());

		String name2 = (String) Ognl.getValue("#user1.name='����',#user1.name",
				oc, oc.getRoot());
		System.out.println(name);
		System.out.println(name2);
	}

	/**
	 * ���÷���
	 */
	@Test
	public void test3() throws Exception {
		// ׼��ONGLContext
		// ׼��Root
		User rootUser = new User("tom", 18);
		// ׼��Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);

		// ��дOGNL���ʽ
		// ����root��user�����setName����
		Ognl.getValue("setName('lilei')", oc, oc.getRoot());
		String name = (String) Ognl.getValue("getName()", oc, oc.getRoot());

		String name2 = (String) Ognl.getValue(
				"#user1.setName('lucy'),#user1.getName()", oc, oc.getRoot());

		System.out.println(name);
		System.out.println(name2);
	}

	/**
	 * ���þ�̬����
	 */
	@Test
	public void test4() throws Exception {
		// ׼��ONGLContext
		// ׼��Root
		User rootUser = new User("tom", 18);
		// ׼��Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);

		// ��дOGNL���ʽ
		String name = (String) Ognl.getValue(
				"@com.yiidian.ognl.OgnlUtil@sayHello('����')", oc, oc.getRoot());
		Double pi = (Double) Ognl.getValue("@@PI", oc, oc.getRoot());
		System.out.println(name);
		System.out.println(pi);
	}

	/**
	 * ��������(List��Map)
	 */
	@Test
	public void test5() throws Exception {
		// ׼��ONGLContext
		// ׼��Root
		User rootUser = new User("tom", 18);
		// ׼��Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);
		
		// ��дOGNL���ʽ
		// ����list����
		Integer size = (Integer) Ognl.getValue("{'tom','jerry','jack','rose'}.size()", oc, oc.getRoot());
		String name = (String) Ognl.getValue("{'tom','jerry','jack','rose'}[0]", oc, oc.getRoot());
		String name2 = (String) Ognl.getValue("{'tom','jerry','jack','rose'}.get(1)", oc, oc.getRoot());
		
		System.out.println(size); 
		System.out.println(name);
		System.out.println(name2);
		 
		// ����Map����
		Integer size2 = (Integer) Ognl.getValue("#{'name':'tom','age':18}.size()", oc, oc.getRoot());
		String name3 = (String) Ognl.getValue("#{'name':'tom','age':18}['name']", oc, oc.getRoot());
		Integer age = (Integer) Ognl.getValue("#{'name':'tom','age':18}.get('age')", oc, oc.getRoot());
		System.out.println(size2);
		System.out.println(name3);
		System.out.println(age);
	}
}
