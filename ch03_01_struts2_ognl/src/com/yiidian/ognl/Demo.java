package com.yiidian.ognl;

import java.util.HashMap;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

import org.junit.Test;

/**
 * Ognl表达式语言
 * 
 * @author 一点教程(yiidian.com)
 */
public class Demo {

	/**
	 * 基本取值
	 */
	@Test
	// 取出root中的属性值
	public void test1() throws Exception {
		// 准备ONGLContext
		// 准备Root
		User rootUser = new User("tom", 18);
		// 准备Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);

		// ====使用OGNL表达式取出属性====
		// 取出root中user对象的name属性
		String name = (String) Ognl.getValue("name", oc, oc.getRoot());
		Integer age = (Integer) Ognl.getValue("age", oc, oc.getRoot());
		System.out.println(name);
		System.out.println(age);

		// ---------------------------------------------------
		// 取出context中键为user1对象的name属性
		String name1 = (String) Ognl.getValue("#user1.name", oc, oc.getRoot());
		String name2 = (String) Ognl.getValue("#user2.name", oc, oc.getRoot());
		Integer age1 = (Integer) Ognl.getValue("#user2.age", oc, oc.getRoot());
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(age1);
	}

	/**
	 * 赋值
	 */
	@Test
	public void test2() throws Exception {
		// 准备ONGLContext
		// 准备Root
		User rootUser = new User("tom", 18);
		// 准备Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);

		// 编写OGNL表达式
		// 将root中的user对象的name属性赋值
		Ognl.getValue("name='jerry'", oc, oc.getRoot());
		String name = (String) Ognl.getValue("name", oc, oc.getRoot());

		String name2 = (String) Ognl.getValue("#user1.name='张三',#user1.name",
				oc, oc.getRoot());
		System.out.println(name);
		System.out.println(name2);
	}

	/**
	 * 调用方法
	 */
	@Test
	public void test3() throws Exception {
		// 准备ONGLContext
		// 准备Root
		User rootUser = new User("tom", 18);
		// 准备Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);

		// 编写OGNL表达式
		// 调用root中user对象的setName方法
		Ognl.getValue("setName('lilei')", oc, oc.getRoot());
		String name = (String) Ognl.getValue("getName()", oc, oc.getRoot());

		String name2 = (String) Ognl.getValue(
				"#user1.setName('lucy'),#user1.getName()", oc, oc.getRoot());

		System.out.println(name);
		System.out.println(name2);
	}

	/**
	 * 调用静态方法
	 */
	@Test
	public void test4() throws Exception {
		// 准备ONGLContext
		// 准备Root
		User rootUser = new User("tom", 18);
		// 准备Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);

		// 编写OGNL表达式
		String name = (String) Ognl.getValue(
				"@com.yiidian.ognl.OgnlUtil@sayHello('张三')", oc, oc.getRoot());
		Double pi = (Double) Ognl.getValue("@@PI", oc, oc.getRoot());
		System.out.println(name);
		System.out.println(pi);
	}

	/**
	 * 创建对象(List、Map)
	 */
	@Test
	public void test5() throws Exception {
		// 准备ONGLContext
		// 准备Root
		User rootUser = new User("tom", 18);
		// 准备Context
		Map<String, User> context = new HashMap<String, User>();
		context.put("user1", new User("jack", 18));
		context.put("user2", new User("rose", 22));
		OgnlContext oc = new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);
		
		// 编写OGNL表达式
		// 创建list对象
		Integer size = (Integer) Ognl.getValue("{'tom','jerry','jack','rose'}.size()", oc, oc.getRoot());
		String name = (String) Ognl.getValue("{'tom','jerry','jack','rose'}[0]", oc, oc.getRoot());
		String name2 = (String) Ognl.getValue("{'tom','jerry','jack','rose'}.get(1)", oc, oc.getRoot());
		
		System.out.println(size); 
		System.out.println(name);
		System.out.println(name2);
		 
		// 创建Map对象
		Integer size2 = (Integer) Ognl.getValue("#{'name':'tom','age':18}.size()", oc, oc.getRoot());
		String name3 = (String) Ognl.getValue("#{'name':'tom','age':18}['name']", oc, oc.getRoot());
		Integer age = (Integer) Ognl.getValue("#{'name':'tom','age':18}.get('age')", oc, oc.getRoot());
		System.out.println(size2);
		System.out.println(name3);
		System.out.println(age);
	}
}
