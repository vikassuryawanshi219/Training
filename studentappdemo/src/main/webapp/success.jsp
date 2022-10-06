<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Get data from value stack</h3>
<s:property value="student"/><br>
<s:property value="message"/><br>
<s:property value="fruits"/><br>
<s:property value="hobbies"/><br>
<h3> Get data from the session</h3>
<s:property value="#session.message"/>
<s:property value="#session.fruits"/>
</body>
</html>