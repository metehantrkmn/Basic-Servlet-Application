package com.Metehan;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class ValidateFilter
 */
@WebFilter("/ValidateServlet")
public class ValidateFilter extends HttpFilter implements Filter {
       
    
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
			
		HttpSession session = req.getSession();
		
		if(session.getAttribute("loggedin").equals("true")) {
			System.out.println("authenticated loggedin");
			chain.doFilter(request, response);
		}else {
			System.out.println("not authenticated loggedout");
			res.sendRedirect("Login.jsp");
		}
		
		// pass the request along the filter chain
	}

	

}
