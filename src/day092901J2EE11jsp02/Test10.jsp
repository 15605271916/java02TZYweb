<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- <%@ include file="inc.jsp"%> --%>
<%-- <%@ include file="inc2.jsp"%> --%>
<%-- <jsp:include page="inc.jsp"></jsp:include> --%>

<jsp:include page='<%=request.getParameter("p") %>'></jsp:include>

test10
</body>
</html>