package com.yiidian.action;
import java.io.File;

import com.opensymphony.xwork2.ActionSupport;
/**
 * �����ļ��Ͳ���
 * @author һ��̳�(yiidian.com)
 */
public class Demo1Action extends ActionSupport{
	//���ձ���ͨ����
	private String name;
	private String password;
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//�����ļ���Ϣ
	private File icon; //����
	private String iconFileName;//����
	private String iconContentType;//����
	public void setIcon(File icon) {
		this.icon = icon;
	}
	public void setIconFileName(String iconFileName) {
		this.iconFileName = iconFileName;
	}
	public void setIconContentType(String iconContentType) {
		this.iconContentType = iconContentType;
	}
	
	@Override
	public String execute() throws Exception {	
		System.out.println("name="+name);
		System.out.println("password="+password);
		System.out.println("�ļ�����--"+icon);
		System.out.println("�ļ�����--"+iconFileName);
		System.out.println("�ļ�����--"+iconContentType);	
		return SUCCESS;
	}
}
