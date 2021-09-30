<%@page import="day093001J2EE12jsp03.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="user" class="day093001J2EE12jsp03.User"></jsp:useBean>

	<jsp:setProperty property="name" name="user" value="qwer" />
	<jsp:setProperty property="flag" name="user" value="true" />

	<jsp:getProperty property="name" name="user" /><br />
	<jsp:getProperty property="flag" name="user" /><br />

	<%
		out.print(user.isFlag());
	%>
	<br />































</body>
</html>