<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>一点教程-struts2的类型转换</title>
  </head>
  <body>
  <s:debug></s:debug>
  <h3>类型转换</h3>
  <form action="demo1.action" method="post">
  	用户名：<input type="text" name="userName"/><br/>
  	密码：<input type="password" name="userPwd"/><br/>
  	邮箱：<input type="text" name="email"/><br/>
  	年龄：<input type="text" name="age"/><br/>
  	成绩：<input type="text" name="result"/><br/>
  	出生年月：<input type="text" name="birth"/><br/>
  	<input type="submit" value="注册"/>
  </form> 
  </body>
</html>
