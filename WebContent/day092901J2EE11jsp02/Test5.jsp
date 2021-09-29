<%@page import="org.apache.tomcat.util.http.fileupload.RequestContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

test5<br />

<%=application %><br />

<%=application.getRealPath("/") %><br />

<%=request %><br />

<%=request.getSession() %><br />

<%=request.getParameter("name") %><br />

<%=response %><br />

<%=session %><br />

<%=session.getId() %><br />

<%=out %><br />

<%out.print("I am out.........."); %><br />

<%=config %><br />

<%=config.getInitParameter("a") %><br />

<%=pageContext %><br />

<%=pageContext.getSession() %><br />

<%=session.getId() %><br />

<%
pageContext.setAttribute("name", "zhangsan");
request.setAttribute("name", "lisi");
session.setAttribute("name", "wangwu");
application.setAttribute("name", "zhaoliu");

pageContext.setAttribute("a", "A", pageContext.REQUEST_SCOPE);
pageContext.setAttribute("a", "A", pageContext.SESSION_SCOPE);
%>

<%
String name="bwf";
%><br />

<%=pageContext.getAttribute("name") %><br />

<%=request.getAttribute("name") %><br />

<%=session.getAttribute("name") %><br />

<%=application.getAttribute("name") %><br />

<%
//request.getRequestDispatcher("Test6.jsp").forward(request, response) ;

%><br />

<%=pageContext.getAttribute("a",pageContext.PAGE_SCOPE) %><br />

<%=pageContext.getAttribute("a",pageContext.REQUEST_SCOPE) %><br />

<%=request.getAttribute("a") %><br />

<%=session.getAttribute("a") %><br />

<%=pageContext.getAttribute("name") %><br />

<% %><br />

<% %><br />





</body>
</html>