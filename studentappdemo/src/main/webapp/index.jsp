<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:url action="show" var="showLink"></s:url>
<s:a href="%{showLink}">Show Message</s:a>

<s:url action="studform" var="studformLink"></s:url>
<s:a href="%{studformLink}">Show Student Form</s:a>

</body>
</html>