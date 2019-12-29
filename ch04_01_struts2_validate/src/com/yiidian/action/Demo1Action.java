package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yiidian.domain.User;
/**
 * 方法（代码）验证
 * @author 一点教程(yiidian.com)
 */
public class Demo1Action extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	@Override
	public User getModel() {
		return null;
	}
	
	//覆盖了validate方法，进行方法验证
	@Override
	public void validate() {
		if(user!=null){
			if(user.getName()==null || user.getName().equals("")){
				//添加错误信息
				this.addFieldError("user.error", "用户名不能为空");
			}
			if(user.getPassword()==null || user.getPassword().equals("")){
				//添加错误信息
				this.addFieldError("password.error", "密码不能为空");
			}
			if(user.getPhone()==null || user.getPhone().equals("")){
				//添加错误信息
				this.addFieldError("phone.error", "手机不能为空");
			}
			if(user.getEmail()==null || user.getEmail().equals("")){
				//添加错误信息
				this.addFieldError("email.error", "邮箱不能为空");
			}
		}
		
	}

	@Override
	public String execute() throws Exception {
		System.out.println("用户注册成功啦");
		return SUCCESS;
	}

	
	
}
