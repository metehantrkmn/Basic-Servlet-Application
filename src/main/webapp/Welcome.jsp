<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<h1>This is Welcome Page</h1>
	<p>Welcome </p>
	<%
		out.write("user Name is: " + request.getParameter("user-name") + "<br>");
		out.write("password is: " + request.getParameter("password") + "<br>");
		out.write("session sent user name: " + request.getSession().getAttribute("userName") + "<br>");
		out.write("session sent password: " + request.getSession().getAttribute("password") + "<br>");
		
	%>
	<!-- eğer bu şkeilde istek atarsan cooki ler silinir -->
	<!-- <a href="./Videos.jsp">Go Videos</a> -->
	<form action="VideosServlet">
		<input type="submit" value="Go Videos">
	</form>
	<form action="LogoutServlet">
		<input type="submit" value="Logout">
	</form>
	

</body>
</html>