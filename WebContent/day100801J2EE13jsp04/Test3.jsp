<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>   
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>日期格式化</title>
</head>
<body>

<%
	Date date=new Date();

	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	pageContext.setAttribute("date", date);
	
	
%>

原始数据:<span>${date }</span><br/>

<span><fmt:formatDate value="${date }"/></span><br/>
<span><fmt:formatDate value="${date }" type="date"/></span><br/>
<span><fmt:formatDate value="${date }" type="time"/></span><br/>
<span><fmt:formatDate value="${date }" type="both"/></span><br/>
<span><fmt:formatDate value="${date }" type="both" dateStyle="full"/></span><br/>
<span><fmt:formatDate value="${date }" type="both" dateStyle="full" timeStyle="full"/></span><br/>

<hr>

<%
String num="1234567.89";

pageContext.setAttribute("num", num);
%>

<span>${num }</span><br/>

<span><fmt:formatNumber value="${num }"></fmt:formatNumber></span><br/>
<span><fmt:formatNumber value="${num }" type="currency"></fmt:formatNumber></span><br/>
<span><fmt:formatNumber value="${num }" type="percent"></fmt:formatNumber></span><br/>
<span><fmt:formatNumber value="${num }" minFractionDigits="5"></fmt:formatNumber></span><br/>
<span><fmt:formatNumber value="${num }" maxFractionDigits="1"></fmt:formatNumber></span><br/>

<hr>

${fn:contains("qwer","qw") }<br/>

</body>
</html>