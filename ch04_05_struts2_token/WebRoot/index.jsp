<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>一点教程-struts2的令牌机制</title>
  </head>
  
  <body>
  <h3>防止重复提交</h3>
  <form action="demo1.action" method="post">
  	<s:token/>
  	用户名：<input type="text" name="name"/><br/>
  	密码：<input type="password" name="password"/><br/>
  	手机：<input type="text" name="phone"/><br/>
  	邮箱：<input type="text" name="email"/><br/>
  	<input type="submit" value="注册"/>
  </form>
  </body>
</html>
