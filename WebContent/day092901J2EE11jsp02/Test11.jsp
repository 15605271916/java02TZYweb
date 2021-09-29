<%@page import="day092901J2EE11jsp02.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		User user = new User();

		user.setId("1");
		user.setName("zhangsan");

		request.setAttribute("user", user);
	%>


	<%
		out.print(user.getId());
		out.print(user.getName());
	%>

	<jsp:useBean id="user2" class="day092901J2EE11jsp02.User"
		scope="request"></jsp:useBean>

	<jsp:setProperty property="id" name="user2" value="2" />

	<jsp:setProperty property="name" name="user2" value="lisi" />


	<%
		out.print(user.getId());
		out.print(user.getName());
	%>

	<jsp:forward page="Test12.jsp"></jsp:forward>

	<br />

	<jsp:getProperty property="id" name="user2" />

	<jsp:getProperty property="name" name="user2" />







</body>
</html>