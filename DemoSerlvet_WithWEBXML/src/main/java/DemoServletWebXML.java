

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class DemoServletWebXML
 */
//@WebServlet("/DemoServletWebXML")
public class DemoServletWebXML implements Servlet {
	private static final long serialVersionUID = 1L;
       

	@Override
	public void destroy() {
		System.out.println("Destroyed");
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
		System.out.println("Init Lifecycle method");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Hello my first servlet project");
	}

}
