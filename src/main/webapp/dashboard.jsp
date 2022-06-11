<%@page import="com.pranaya.model.Request"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="fx" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	%>
	
	<div>
		<h1>Active Requests</h1>
		<table align = "center" cellpadding = "5" cellspacing ="5" border ="2">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Message</th>
				<th>Status</th>
				<th>Toggle</th>
			</tr>
			
			<fx:forEach items ="${requests}" var = "req" >
				<fx:if test="${!req.rstatus}">
					<tr>
						<td>${req.rid}</td>
						<td>${req.rname}</td>
						<td>${req.remail}</td>
						<td>${req.rmessage}</td>
						<td>Active</td>
						<td>
							<form action="dashboard" method = "post">
									<button type = "submit" value = ${req.rid} name ="reqId">Archive</button>
							</form>
						</td>
					</tr>	
				</fx:if>	
			</fx:forEach>
		</table>
	</div>
	
	
	<div>
		<h1>Archive Requests</h1>
		<table align = "center" cellpadding = "5" cellspacing ="5" border ="2">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Message</th>
				<th>Status</th>
				<th>Toggle</th>
			</tr>
			
			<fx:forEach items ="${requests}" var = "req" >
				<fx:if test="${req.rstatus}">
					<tr>
						<td>${req.rid}</td>
						<td>${req.rname}</td>
						<td>${req.remail}</td>
						<td>${req.rmessage}</td>
						<td>Archive</td>
						<td>
							<form action="dashboard" method = "post">
									<button type = "submit" value = ${req.rid} name ="reqId">Active</button>
							</form>
						</td>
					</tr>	
				</fx:if>	
			</fx:forEach>
		</table>
	</div>
	
	
	<br>
	<form action="login">
		<input type="submit" value = "Logout">
	</form>
	
	

</body>
</html>