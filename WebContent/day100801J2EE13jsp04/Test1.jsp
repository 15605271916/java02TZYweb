<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="day100801J2EE13jsp04.User"%>
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
//使用脚本生成数据

User u1=new User();
u1.setId(1);
u1.setName("zhangsan");
u1.setSex("男");

User u2=new User();
u2.setId(2);
u2.setName("lisi");
u2.setSex("女");

User u3=new User();
u3.setId(3);
u3.setName("wangwu");
u3.setSex("男");

List<User> users=new ArrayList<User>();
users.add(u1);
users.add(u2);
users.add(u3);

pageContext.setAttribute("users", users);

%>




<table>
	<thead>
		<th>
			<td>编号</td><td>姓名</td><td>性别</td>
		
		<th>
	
	</thead>
	
	<tbody>
		<c:forEach items="${users}" var="u" varStatus="status">
			<tr>
				<td>${u.id }</td><td>${u.name }</td><td>${u.sex }</td>
			</tr>
		</c:forEach>
	
	
	</tbody>

</table>

</body>
</html>