package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("un");
		String pass=request.getParameter("pw");
		PrintWriter pw=response.getWriter();
		if(user.equals("Admin")&&pass.equals("cts"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("success.html");
			pw.print("<html><body>Forward content</body></html>");
			rd.forward(request,response);
			}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			pw.print("<html><body>Authentication failed!!!!</body></html>");
			rd.include(request,response);
		}
		
		
		
	}

}
