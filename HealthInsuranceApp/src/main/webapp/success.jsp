<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.healthapp.model.Plan"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%
Plan plan=(Plan) request.getAttribute("plan");%>
PlanName<%= plan.getPlanName() %><br>
Brand<%= plan.getBrand() %><br>
Coverage<%= plan.getCoverage() %><br>
Category()<%= plan.getCategory() %><br>
SumInsured()<%= plan.getSumInsured() %><br> --%>

<h1>  Using expression language </h1>
PlanName ${plan.planName}<br>
Category ${plan.category}<br>
Brand ${plan.brand}<br>
Coverage ${plan.coverage}<br>
SumInsured ${plan.sumInsured}<br>
</body>
</html>