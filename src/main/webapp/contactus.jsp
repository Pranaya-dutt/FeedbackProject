<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Us</title>
</head>
<body style="text-align: center; margin: 50px">
	
	<h1><u>Contact Us</u></h1>
	<p style="font-size: 18px"><i>Please fill this form in a decent manner.</i></p>
	<br>
	<form action="contactus" method="post">
		<div class="form-content">
			<label for = "rname" id = "rname-label" style="display: block; font-size: 24px; margin-bottom: 10px">Full Name</label>
			<input type = "text" name = "rname" placeholder="Enter your name" style="margin-bottom: 10px; padding: 10px; min-width: 400px" />
		</div>
		<div class="form-content">
			<label for = "remail" id = "remail-label" style="display: block; font-size: 24px; margin-bottom: 10px">Email</label>
			<input type = "email" name = "remail" placeholder="Enter your email" style="margin-bottom: 10px; padding: 10px; min-width: 400px"/>
		</div>
		<div class="form-content">
			<label for = "rmessage" id = "rmessage-label" style="display: block; font-size: 24px; margin-bottom: 10px">Message</label>
			<textarea name="rmessage" id = "rmessage" class = "textarea-input" rows="4" cols="50" placeholder="Enter your message..." style="margin-bottom: 10px"></textarea>
		</div>
		<div class="form-content">
			<button type="submit" style="min-width: 100px; padding: 5px">Submit</button>
		</div>
	</form>
	
</body>
</html>