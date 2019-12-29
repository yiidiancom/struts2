<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>一点教程-注册页面</title>
  </head>
  <body>
    <form action="customer/save.action" method="post">
    	客户姓名：<input type="text" name="custName"/><br/>
    	客户电话：<input type="text" name="custPhone"/><br/>
    	客户地址：<input type="text" name="custAddress"/><br/>
    	<input type="submit" value="提交"/>
    </form>
  </body>
</html>
