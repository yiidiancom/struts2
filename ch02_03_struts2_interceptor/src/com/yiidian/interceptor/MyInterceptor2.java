package com.yiidian.interceptor;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
/**
 * 拦截器
 * @author 一点教程(yiidian.com)
 */
public class MyInterceptor2 implements Interceptor{

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	//拦截的方法
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("2号执行拦截器--2.在执行action之前");
		
		//执行action的方法
		invocation.invoke();
		
		System.out.println("2号执行拦截器--4.在执行action之后");
		
		return null;
	}

}
