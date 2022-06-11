<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body style="margin: 200px">
	
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	%>
	
	<form action="login" method="post" style="text-align: center;">
		<div>
			<label for = "uname" id = "uname-label" style="display: block; font-size: 24px; margin-bottom: 10px">Enter Username</label>
			<input type = "text" name = "uname" placeholder="Enter username" style="margin-bottom: 10px; padding: 10px; min-width: 400px" />
		</div>
		<div>
			<label for = "pass" id = "pass-label" style="display: block; font-size: 24px; margin-bottom: 10px">Enter Password</label>
			<input type = "password" name = "pass" placeholder="Enter password" style="margin-bottom: 10px; padding: 10px; min-width: 400px" />			
		</div>
		<div>
			<button type="submit" style="min-width: 100px; padding: 5px">Login</button>
		</div>
	</form>
	
</body>
</html>