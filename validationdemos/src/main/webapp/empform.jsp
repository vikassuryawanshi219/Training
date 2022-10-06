<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="register">
  <s:textfield name="employee.name" label="Name"></s:textfield>
  <s:textfield name="employee.city" label="City"></s:textfield>
  <s:textfield name="employee.age" label="Age"></s:textfield>
  <s:textfield name="employee.email" label="Email"></s:textfield>
  <s:textfield name="employee.salary" label="Salary"></s:textfield>
  <s:submit value="Register"></s:submit>
</s:form>
</body>
</html>