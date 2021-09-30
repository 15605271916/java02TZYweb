<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

jsp:<%=pageContext %><br />
EL:${pageContext }<br />
EL:${name }<br />

jsp:<%=request %><br />
EL:${request }

<%
request.setAttribute("a", "A");
request.setAttribute("b", "B");
request.setAttribute("c", "C");
session.setAttribute("d", "D");

%>

jsp:<%=request %>
el:${requestScope }<br />
el:${requestScope.a }<br />
el:${requestScope.b }<br />
el:${requestScope['c'] }<br />
el:${requestScope.d }<br />
jsp:<%=session.getAttribute("d") %><br />

==========<br />

jsp:<%=request %><br />
el:${d }<br />
el:${requestScope.d }<br />
el:${sessionScope.d }<br />

jsp:<%=request.getParameter("a") %><br />
el:${param }<br />
el:${param.a }<br />
el:${param.b }<br />
el:${param['c'] }<br />

==========<br />

jsp:<%=request.getParameterValues("aihao")%><br />
el:${paramValues }<br />
el:${paramValues.a[0] }<br />
el:${paramValues.a[1] }<br />
el:${paramValues.a[2] }<br />
el:${paramValues.a[3] }<br />
el:${paramValues.aihao[0] }<br />
el:${paramValues.aihao[1] }<br />
el:${paramValues.aihao[2] }<br />

==========<br />

jsp:<%=request.getHeader("user-agent") %><br />
el:${header }<br />
el:${header.cookie }<br />
el:${header["user-agent"] }<br />

el:${headerValues }<br />
el:${headerValues.cookie[0] }<br />
el:${headerValues.cookie[1] }<br />

el:${initParam }<br />
el:${initParam.a }<br />
el:${initParam.b }<br />

==========<br />

el:${cookie }<br />
el:${cookie.JSESSIONID }<br />
el:${cookie.JSESSIONID.name }<br />
el:${cookie.JSESSIONID.value }<br />

==========<br />

<%
Cookie[] cookies=request.getCookies();
	for(Cookie c:cookies){
		if(c.getName().equals("cna")){
			out.print(c.getValue());
			break;
		}
	}
%>
el:${cookie.cna.value }

</body>
</html>