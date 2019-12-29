<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>一点教程-成功页面</title>
  </head>
  <body>
  ${requestScope.request_data }<br/>
  ${sessionScope.session_data }<br/>
  ${applicationScope.application_data }<br/>
  </body>
</html>
