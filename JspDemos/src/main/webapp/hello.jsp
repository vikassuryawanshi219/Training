<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!String name="ram";%>

<%="welcome "+name %>
<% int x=10;%>
<%="have a great day"+x %>
<%!int count=0; %>
you are visitor number<%=count++ %>
<br>
<%! String greet(){
	return"welcome back";
	}
	%>
	<%=greet() %>

</body>
</html>