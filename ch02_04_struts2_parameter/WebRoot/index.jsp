<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>一点教程-struts2的请求参数封装</title>
  </head>
  <body>
  <h3>属性驱动-普通属性驱动</h3>
  <form action="demo1.action" method="post">
  	用户名：<input type="text" name="userName"/><br/>
  	密码：<input type="password" name="userPwd"/><br/>
  	邮箱：<input type="text" name="email"/><br/>
  	<input type="submit" value="注册"/>
  </form>
  
  <hr/>

  <h3>JavaBean属性驱动</h3>
  <form action="demo2.action" method="post">
  	用户名：<input type="text" name="user.userName"/><br/>
  	密码：<input type="password" name="user.userPwd"/><br/>
  	邮箱：<input type="text" name="user.email"/><br/>
  	<input type="submit" value="注册"/>
  </form>
  
  <h3>模型驱动</h3>
  <form action="demo3.action" method="post">
  	用户名：<input type="text" name="userName"/><br/>
  	密码：<input type="password" name="userPwd"/><br/>
  	邮箱：<input type="text" name="email"/><br/>
  	<input type="submit" value="注册"/>
  </form>
  
  </body>
</html>
