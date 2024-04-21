<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
	
	<div class="main-body">
		
		<h1 class="topic">Login Page</h1>
	
		<div class="login-container">
			<div class="inner-box">
				<form action="WelcomeServlet">
					<input type="text" name="user-name">
					<input type="password" name="password">
					<input type="submit">
				</form>
			</div>	
		</div>
	
		<div class="footer-container">
			<div class="footer-boxes">
				<p>this is a footer text</p>
			</div>
			<div class="footer-boxes">
				<p>this is a footer text</p>
			</div>
			<div class="footer-boxes">
				<p>this is a footer text</p>
			</div>
		</div>
	</div>

</body>
</html>