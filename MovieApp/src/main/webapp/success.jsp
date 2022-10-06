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
/* String username=(String)  request.getAttribute("username");
out.print("welcome "+ username +"<br>"); */

 String username=(String)  session.getAttribute("username");
out.print("welcome "+ username +"<br>"); 

%>
<%session.getId();%>
<%
session.invalidate();
%>
<form action="Movie">
select Language
<select name="language">
<option value= "select">---select---</option>
<option value= "hindi">Hindi</option>
<option value= "punjabi">Punjabi</option>
<option value= "urdu">Urdu</option>
<option value= "english">English</option>
</select><br>
<input type="submit" value= "enter"><br>
</form>

</body>
</html>