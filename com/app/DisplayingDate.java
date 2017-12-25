package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class DisplayingDate
 */
public class DisplayingDate extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		Date today = new Date();
			pw.println("<html>"+"<body><h1>Today Date is</h1>");
				pw.println("<b>"+ today+"</b></body>"+ "</html>");
	}

}
