<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="register">
		<s:textfield name="student.name" label="Name"></s:textfield>
	 	<s:password name="student.password" label="Password"></s:password>
		<s:textfield name="student.city" label="City"></s:textfield>
		<s:textfield name="student.age" label="Age"></s:textfield>
		<s:textfield name="student.mobile" label="Mobile"></s:textfield>
		<s:textfield name="student.allowance" label="Allowance"></s:textfield>
		<s:select label="Course" name="student.course"
			list="{'Java','Python','C++'}"></s:select>
		<s:radio label="Gender" name="student.gender" list="{'Male','Female'}"></s:radio>
		<s:textfield name="student.email" label="Email"></s:textfield>

		<s:checkboxlist name="student.hobby" list="hobbies" label="Hobbies"></s:checkboxlist>



		<s:submit value="Show Student"></s:submit>
	</s:form>

<!--  for the use of properties file -->

<%-- <s:form action="register">
		<s:textfield key="student name" ></s:textfield>
		<s:password key="student password" ></s:password>
		<s:textfield key="student city" ></s:textfield>
		<s:textfield key="studentage" ></s:textfield>
		<s:textfield key="student mobile" ></s:textfield>
		<s:textfield key="student allowance" ></s:textfield>
		<s:select  key="student course"
			list="{'Java','Python','C++'}"></s:select>
		<s:radio  key="student gender" list="{'Male','Female'}"></s:radio>
		<s:textfield key="student email" ></s:textfield>

		<s:checkboxlist key="student hobby" list="hobbies" ></s:checkboxlist>



		<s:submit value="Show Student"></s:submit>
	</s:form> --%>
</body>
</html>