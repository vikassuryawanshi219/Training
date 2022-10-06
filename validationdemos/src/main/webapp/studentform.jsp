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
<s:form action="submit">
 <s:textfield name="student.name" label="Name"></s:textfield>
  <s:textfield name="student.age" label="Age"></s:textfield>
  <s:radio label="gender" name="student.gender" list="{'Male','Female'}"></s:radio>
 <%--  <s:checkboxlist key="student.hobbies" list="Hobbie" />  --%>
  <s:radio label="courses" name="student.courses" list="{'Java','Python','C++'}"></s:radio>
  <s:textfield name="student.allowance" label="Allowance"></s:textfield>
 <%--  <s:textfield name="student.phone" label="Phone"></s:textfield> --%>
  <s:submit value="Register"></s:submit>
</s:form>
</body>
</html>