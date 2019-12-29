<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>一点教程-struts2的国际化</title>
  </head> 
  <body>
  <h3><s:text name="loginInfo"/></h3>
  <form action="demo1.action" method="post">
  	<s:text name="user"/>：<input type="text" name="userName"/><br/>
  	<s:text name="password"/>：<input type="password" name="userPwd"/><br/>
  	<input type="submit" value="<s:text name="loginbtn"/>"/>
  </form>
  </body>
</html>
