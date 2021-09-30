<%@page import="day093001J2EE12jsp03.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String name="zhangsan"; 
pageContext.setAttribute("name", name);
%>
<c:out value="qwer"></c:out><br/>
<c:out value="<%=name %>"></c:out><br>
<c:out value='<%=pageContext.getAttribute("name") %>'></c:out><br> 
<c:out value="${name }"></c:out><br/>

${name }<br/>

<c:out value="${name }"></c:out><br/>
<c:out value="${name }" escapeXml="false"></c:out><br/>
<c:out value="${name2}" default="张三"></c:out><br/>

<c:set var="name2" value="lisi" scope="request"></c:set>

<%=pageContext.getAttribute("name2") %><br/>
<%=request.getAttribute("name2") %><br/>

<c:out value="${name2 }"></c:out><br/>

${name2 }<br/>

<jsp:useBean id="user" class="day093001J2EE12jsp03.User"></jsp:useBean>

<c:set target="${user}" property="name" value="wangwu"></c:set>

<jsp:getProperty property="name" name="user"/>  <br/>

<%=((User)pageContext.getAttribute("user")).getName() %><br/>

<c:out value="${user.name }"></c:out><br/>

${user.name }<br/>

${requestScope }<br/>

${name2 }<br/>

<c:remove var="name2"/>

${name2 }<br/>

<c:if test="true">
	对的
</c:if>

<c:if test="!true">
	错的
</c:if>

<c:if test="${param.name=='a' }">
	是A
</c:if>

<c:if test="${param.name=='b' }">
	是B
</c:if>

<c:if test="${param.name=='c' }">
	是C
</c:if>

<%
if(request.getParameter("name").equals("a")){
%>
		还是A
<%}else if(request.getParameter("name").equals("b")){%>
		还是B
<%}else if(request.getParameter("name").equals("c")){ %>
		还是C
<%} %>

<c:choose>
	<c:when test="${param.name=='a' }">
			确实是A
	</c:when>
	
	<c:when test="${param.name=='b' }">
			确实是B
	</c:when>
	
	<c:when test="${param.name=='c' }">
			确实是C
	</c:when>
	
	<c:otherwise>
				一个都不是
	</c:otherwise>
</c:choose>
<br/>

<c:import url="inc.jsp"></c:import><br/>

<%@include file="inc.jsp" %><br/>

<jsp:include page="inc.jsp"></jsp:include><br/>

<%-- <c:import url="http://www.baidu.com" charEncoding="utf-8"></c:import> --%>
<%
//response.sendRedirect("inc.jsp");
%>
<%-- <c:redirect url="inc.jsp"></c:redirect> --%>

 <a href="<c:url value="http://www.baidu.com"/>">aaaaa</a>

</body>
</html>