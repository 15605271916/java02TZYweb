<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<span>张三</span>
	<br />

	<%String name = "lisi";%>
	<%=name%>
	<br />

	<%for (int i = 1; i <= 10; i++) {%>
	<%=i%>
	<%}%>
	<br />

	<%=1 + 1%>
	<br />

	<%for (int j = 1; j <= 5; j++) {%>
	<%="qwer"%>
	<%}%>
	<br />



</body>
</html>