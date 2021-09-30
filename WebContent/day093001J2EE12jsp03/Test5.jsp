<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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

<c:forEach begin="1" end="10" var="i" step="2" varStatus="k">

循环:<%=pageContext.getAttribute("i") %>:${i }:${k.index }:${k.count }:${k.first }:${k.last }<br/>

</c:forEach>

<%=pageContext.getAttribute("i") %><br/>
	
	<hr/>
	
	<%
		List list=new ArrayList();
	list.add("张三");
	list.add("李四");
	list.add("王五");
	list.add("赵六");
	
	pageContext.setAttribute("list", list);
	
	Map map=new HashMap();
	map.put("a", "A");
	map.put("b", "B");
	map.put("c", "C");
	map.put("d", "D");
	
	pageContext.setAttribute("map", map);
	
	%>
<ul>
	
<c:forEach items="${list}" var="name" varStatus="s">

	<c:if test="${s.index%2==0}">
	<li style="color:red">
	</c:if>
	<c:if test="${s.index%2!=0}">
	<li style="color:green">
	</c:if>
	${name }</li>
	
</c:forEach>

<ol>

<c:forEach items="${map }" var="entry">

	<li>${entry.key }:${entry.value }</li>

</c:forEach>

</ol>

</ul>

</body>
</html>