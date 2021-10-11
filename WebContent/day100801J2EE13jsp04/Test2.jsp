<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String data = "zhangsan,lisi,wangwu,zhaoliu,wangermazi";

		String[] datas = data.split(",");

		pageContext.setAttribute("datas", datas);
		
		pageContext.setAttribute("data", data);
	%>

	<ul>

		<c:forEach items="${datas }" var="data">

			<li>${data }</li>

		</c:forEach>

	</ul>

	<ol>

		<c:forTokens items="${data }" delims="," var="d">

			<li>${d }</li>

		</c:forTokens>

	</ol>

</body>
</html>