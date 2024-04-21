package com.Metehan;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		HttpSession session =  req.getSession();
		session.removeAttribute("userName");
		session.removeAttribute("password");
		session.setAttribute("loggedin", "false");
		res.sendRedirect("Login.jsp");
		
	}
	
}
