<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>一点教程-使用Servlet的API</title>
  </head>
  <body>
  	<h3>使用ServletActionContext类</h3>
  	<form action="demo1.action" method="post">
  		姓名：<input type="text" name="name"/><br/>
  		性别：<input type="text" name="gender"/><br/>
  		年龄：<input type="text" name="age"/><br/>
  		<input type="submit" value="提交"/>
  	</form>	
  	<hr/> 	
  	<h3>使用ActionContext类</h3>
  	<form action="demo2.action" method="post">
  		姓名：<input type="text" name="name"/><br/>
  		性别：<input type="text" name="gender"/><br/>
  		年龄：<input type="text" name="age"/><br/>
  		<input type="submit" value="提交"/>
  	</form>
  	<h3>使用接口注入方式</h3>
  	<form action="demo3.action" method="post">
  		姓名：<input type="text" name="name"/><br/>
  		性别：<input type="text" name="gender"/><br/>
  		年龄：<input type="text" name="age"/><br/>
  		<input type="submit" value="提交"/>
  	</form>
  </body>
</html>
