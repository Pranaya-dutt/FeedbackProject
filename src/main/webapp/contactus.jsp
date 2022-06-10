<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Us</title>
</head>
<body>
	
	<h1>Contact Us</h1>
	<h3>Please fill this form in a decent manner.</h3>
	<br>
	<form action="contactus" method="post">
		<div class="form-content">
			<label for = "rname" id = "rname-label" >Full Name</label>
			<input type = "text" name = "rname" placeholder="Enter your name"/>
		</div>
		<div class="form-content">
			<label for = "remail" id = "remail-label">Email</label>
			<input type = "email" name = "remail" placeholder="Enter your email"/>
		</div>
		<div class="form-content">
			<label for = "rmessage" id = "rmessage-label">Message</label>
			<textarea name="rmessage" id = "rmessage" class = "textarea-input" rows="4" cols="50" placeholder="Enter your message..."></textarea>
		</div>
		<div class="form-content">
			<input type="submit">
		</div>
	</form>
	
</body>
</html>