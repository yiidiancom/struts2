<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>一点教程-struts2的表单验证</title>
  </head>
  <body>
  <h3>XML验证验证</h3>
  <s:fielderror/>
  <%--
  验证需求：
    1） 全部数据不能为空
    2）用户名长度4-20位之间
    3）密码长度6-16位之间
    4）手机格式是合法的
    5）邮箱格式是合法的
  --%>
  <form action="demo1.action" method="post">
  	用户名：<input type="text" name="name"/><br/>
  	密码：<input type="password" name="password"/><br/>
  	手机：<input type="text" name="phone"/><br/>
  	邮箱：<input type="text" name="email"/><br/>
  	<input type="submit" value="注册"/>
  </form>
  </body>
</html>
