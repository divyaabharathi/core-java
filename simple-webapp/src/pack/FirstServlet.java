package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int i=0;
	private int j=0;
       
    
   

	
	public void init(ServletConfig config) throws ServletException {
		i++;
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		j++;
		PrintWriter pw=response.getWriter();
		System.out.println("doget() is called");
		pw.print("<html><body>");
		pw.print("<p>valueof i="+i+",value of j= "+j+"</p><html><body>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		j++;
		PrintWriter pw=response.getWriter();
		System.out.println("do-post() is called");
		pw.print("<html><body>");
		pw.print("<p>valueof i="+i+",value of j= "+j+"</p><html><body>");
	}

}