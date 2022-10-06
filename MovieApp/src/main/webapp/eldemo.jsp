<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% application.setAttribute("username","nandani") ;%>
<% pageContext.setAttribute("username","vaishali"); %>
<% request.setAttribute("username","vikas"); %>
<% session.setAttribute("username","prakrati"); %>


<% session.setAttribute("message","have a great day"); %>
<% application.setAttribute("newmessage","backend training is covered"); %>

${username}
${requestScope.username}
${sessionScope.username}
${message }
${newmessage}
${applicationScope.username}
</body>
</html>