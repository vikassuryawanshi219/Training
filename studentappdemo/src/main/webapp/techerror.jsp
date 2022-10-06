<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Exception</h1>
<s:property value="exception"></s:property>

<h1>Details</h1>
<s:property value="exceptionStack"></s:property>
</body>
</html>