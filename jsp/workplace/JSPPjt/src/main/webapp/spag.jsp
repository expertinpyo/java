<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	pageContext.setAttribute("model", "pageContext");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=request.getAttribute("model") %> 입니다.
	${requestScope.model}<br>
	${names[2]}<br>
	${notice.title}<br>
	${model}<br>
	${param.n}<br>
	${header.host}
</body>
</html>