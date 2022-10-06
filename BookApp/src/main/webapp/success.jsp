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
String title= (String )request.getAttribute("name");
out.print("Title is "+title+"<br>");
int Id=(Integer)request.getAttribute("bookId");
out.print("book id is "+Id+"<br>");
out.print("author name "+request.getAttribute("authorname"));
out.print("category is "+request.getAttribute("category"));
double rate=(Double)request.getAttribute("bookprice");
out.print("book price is "+rate+"<br>");
%>

</body>
</html>