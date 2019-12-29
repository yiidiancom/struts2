package com.yiidian.action;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLEncoder;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * �ļ�����
 * @author һ��̳�(yiidian.com)
 */
public class Demo1Action extends ActionSupport{
	private File file = null;
	//�ṩ�ļ�����
	public String getFileName() throws Exception{
		return URLEncoder.encode(file.getName(),"utf-8");
	}
	//�ṩ�����ļ���������
	public InputStream getFileStream() throws Exception{
		return new FileInputStream(file);
	}
 
	@Override
	public String execute() throws Exception {
		//��ȡ��Ҫ���ص��ļ�
		String uploadPath = ServletActionContext.getServletContext().getRealPath("upload");
		file = new File(uploadPath+"/spring.jpg");
		//struts2������һ����stream����ͼ�����ļ�����
		return SUCCESS;
	}
}
