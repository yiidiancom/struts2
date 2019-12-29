<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>一点教程-struts2的文件上传</title>
  </head>
  <body>
  <h3>文件上传</h3>
  <form action="demo1.action" method="post" enctype="multipart/form-data">
  	用户名：<input type="text" name="name"/><br/>
  	密码：<input type="password" name="password"/><br/>
  	请选择头像：<input type="file" name="icon"/><br/>
  	 <input type="submit" value="上传"/>
  </form>
  </body>
</html>
