package com.demo.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("this is in servlet destroy()");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("this is in demo servlet init()");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("this is in demo servlet service()");
		resp.getWriter().println("Haha this is demoServlet");
	}
	
	

}
