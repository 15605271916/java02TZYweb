<%@page import="day093001J2EE12jsp03.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	${1+1} <br />
	${5/2} <br />
	${5%2} <br />

	==========<br />
	
	${5>2} <br />
	${true&&false} 或者${true and false} <br />
	${true||false} 或者${true or false} <br />
	${!true} 或者${not true} <br />
	${empty name} <br />
	
	==========<br />

	<%
		String name="qwer";
		pageContext.setAttribute("name", "a");
	%>
	${empty name} <br />
	
	==========<br />

	<%
		User user=new User();

		user.setId(1);
		user.setName("zhangsan");
		user.setFlag(true);
	
		pageContext.setAttribute("user", user);
		
		String str=request.getParameter("str");
		
		pageContext.setAttribute("str", str);
	%>

	${user }<br />
	${empty user }<br />
	脚本：<%=user.getName() %><br />
	作用域：<%=((User)pageContext.getAttribute("user")).getName() %><br />
	EL表达式1：${user.getName() }<br />
	EL表达式2：${user.name }<br />
	EL表达式3：${user["name"] }<br />
	EL表达式4：${user['name'] }<br />
	<%-- EL表达式5：${str["str"] }<br /> --%>
	
	注：EL表达式和javabean控制的并不是属性，而是你指定名字的对应的set/get方法

	==========<br />


</body>
</html>