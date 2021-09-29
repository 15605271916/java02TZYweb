<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
		User user1 = new User();
		user1.setId("1");
		user1.setName("zhangsan");
		user1.setSex("man");

		User user2 = new User();
		user2.setId("2");
		user2.setName("lisi");
		user2.setSex("woman");

		User user3 = new User();
		user3.setId("3");
		user3.setName("wangwu");
		user3.setSex("man");

		List<User> users = new ArrayList<User>();

		users.add(user1);
		users.add(user2);
		users.add(user3);
	%>

	编号:<%=user1.getId()%><br /> 姓名:<%=user1.getName()%><br /> 性别:<%=user1.getSex()%><br />
	编号:<%=user2.getId()%><br /> 姓名:<%=user2.getName()%><br /> 性别:<%=user2.getSex()%><br />
	编号:<%=user3.getId()%><br /> 姓名:<%=user3.getName()%><br /> 性别:<%=user3.getSex()%><br />

	<table>
		<thead>
			<tr>
				<td>编号</td>
				<td>姓名</td>
				<td>性别</td>
			</tr>
		</thead>
		<tbody>
			<%
				for (User u : users) {
			%>
			<tr>
				<td><%=u.getId()%></td>
				<td><%=u.getName()%></td>
				<td><%=u.getSex()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>

</body>
</html>