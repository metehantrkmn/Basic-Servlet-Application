package com.Metehan;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticatedFilter
 */
@WebFilter(urlPatterns = {"/VideosServlet","/Videos.jsp","/Welcome.jsp","/DispatcherServlet"})
public class AuthenticatedFilter extends HttpFilter implements Filter {
       
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		HttpSession session = req.getSession();	
		
		if(session.getAttribute("userName").equals("metehan")) {
			System.out.println("authenticated " + session.getAttribute("userName"));
			chain.doFilter(request, response);
		}else {
			System.out.println("not authenticated");
			res.sendRedirect("Login.jsp");
		}
		
		// pass the request along the filter chain
	}



}
