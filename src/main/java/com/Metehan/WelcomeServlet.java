package com.Metehan;

import java.io.IOException;
import java.net.HttpCookie;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WelcomeServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		String userName = req.getParameter("user-name");
		String password = req.getParameter("password");
		
		HttpSession session = req.getSession();
		session.setAttribute("userName", userName);
		session.setAttribute("password", password);
		
		System.out.println("welcomeServlet");
		
		res.sendRedirect("DispatcherServlet");
		
	}
	
}
