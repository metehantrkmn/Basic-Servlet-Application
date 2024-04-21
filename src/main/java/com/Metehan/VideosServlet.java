package com.Metehan;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VideosServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("Videos.jsp");
		  res.addHeader("Pragma", "no-cache");
		  res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		  res.addHeader("Cache-Control", "pre-check=0, post-check=0");
		  res.setDateHeader("Expires", 0);
		dispatcher.forward(req, res);
		
	}
	
}
