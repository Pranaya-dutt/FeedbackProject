<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	%>
	
	<form action="login" method="post">
		Enter username : <input type = "text" name = "uname"> <br>
		Enter password : <input type="password" name="pass"> <br>
		<input type="submit" value="login">
	</form>
	
</body>
</html>