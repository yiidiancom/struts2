package com.yiidian.interceptor;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
/**
 * ������
 * @author һ��̳�(yiidian.com)
 */
public class MyInterceptor1 implements Interceptor{

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	//���صķ���
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("1��ִ��������--1.��ִ��action֮ǰ");
		
		//ִ��action�ķ���
		invocation.invoke();
		
		System.out.println("1��ִ��������--5.��ִ��action֮��");
		
		return null;
	}

}
