package com.yiidian.action;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLEncoder;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 文件下载
 * @author 一点教程(yiidian.com)
 */
public class Demo1Action extends ActionSupport{
	private File file = null;
	//提供文件名称
	public String getFileName() throws Exception{
		return URLEncoder.encode(file.getName(),"utf-8");
	}
	//提供下载文件的输入流
	public InputStream getFileStream() throws Exception{
		return new FileInputStream(file);
	}
 
	@Override
	public String execute() throws Exception {
		//读取需要下载的文件
		String uploadPath = ServletActionContext.getServletContext().getRealPath("upload");
		file = new File(uploadPath+"/spring.jpg");
		//struts2是依靠一个叫stream的视图进行文件下载
		return SUCCESS;
	}
}
