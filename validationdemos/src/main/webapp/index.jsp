<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:url action='empform' var="vempform"></s:url>
<s:a href="%{vempform}">Show Employed Form</s:a><br>

<!--  <a href="<s:url action='empform'></s:url>">Show Employed Form</a>   -->

<s:url action='studentform' var="vstudentform"></s:url>
<s:a href="%{vstudentform}">Show Student Form</s:a><br>
</body>
</html>