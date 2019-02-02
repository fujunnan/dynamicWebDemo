package com.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("this is Filter destroy()");

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("This is in doFilter");
		arg2.doFilter(arg0, arg1);
		arg1.getWriter().println("end of doFilter");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("this is in filter init()");
	}

}
