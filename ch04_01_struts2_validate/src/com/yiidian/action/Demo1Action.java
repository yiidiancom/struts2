package com.yiidian.action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yiidian.domain.User;
/**
 * ���������룩��֤
 * @author һ��̳�(yiidian.com)
 */
public class Demo1Action extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	@Override
	public User getModel() {
		return null;
	}
	
	//������validate���������з�����֤
	@Override
	public void validate() {
		if(user!=null){
			if(user.getName()==null || user.getName().equals("")){
				//��Ӵ�����Ϣ
				this.addFieldError("user.error", "�û�������Ϊ��");
			}
			if(user.getPassword()==null || user.getPassword().equals("")){
				//��Ӵ�����Ϣ
				this.addFieldError("password.error", "���벻��Ϊ��");
			}
			if(user.getPhone()==null || user.getPhone().equals("")){
				//��Ӵ�����Ϣ
				this.addFieldError("phone.error", "�ֻ�����Ϊ��");
			}
			if(user.getEmail()==null || user.getEmail().equals("")){
				//��Ӵ�����Ϣ
				this.addFieldError("email.error", "���䲻��Ϊ��");
			}
		}
		
	}

	@Override
	public String execute() throws Exception {
		System.out.println("�û�ע��ɹ���");
		return SUCCESS;
	}

	
	
}
