<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>成功页面</title>
</head>

<body>
	<s:debug></s:debug>
	
	<hr/>
	<%--取出contextMap的数据 --%>
	
	<!-- 取出ContextMap对象的数据-->
	<s:property value="#hello" />
	<br />
	<!-- 取出ContextMap的request属性-->
	<s:property value="#request.rerquestMap" />
	<br />
	<!-- 取出ContextMap的session属性 -->
	<s:property value="#session.sessionMap" />
	<br />
	<!-- 取出ContextMap的application属性 -->
	<s:property value="#application.applicationMap" />
	<br />
	<hr />
	<!-- 通过ContextMap的attr属性，也可以取出域对象的数据 -->
	<s:property value="#attr.rerquestMap" />
	<br />
	<s:property value="#attr.sessionMap" />
	<br />
	<s:property value="#attr.applicationMap" />
	<br />
	
	<hr/>
	
	<%--
 		获取值栈不需要带#号
 		获取值栈的规则：
 			默认情况下，都是从栈顶元素往后查找，一直查找到最后一个元素为止
 	 --%>
 	<s:property value="[0].top"/><br/>
 	<s:property value="[1].top"/>
 	
 	<hr/>
 	<s:property value="name"/> - <s:property value="[0].top.gender"/>
</body>
</html>
