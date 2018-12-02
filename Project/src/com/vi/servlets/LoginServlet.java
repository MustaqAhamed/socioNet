package com.vi.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vi.db.DBHelper;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String uname= request.getParameter("uname");
		String pword= request.getParameter("pword");
		
		DBHelper db = new DBHelper();
		int status = db.getLoginStatus(uname,pword);
		if(status==1) {
			RequestDispatcher rd = request.getRequestDispatcher("page1.jsp");
			rd.forward(request, response);
		}else if(status==-1) {
			pw.println("<html>"
					+ "<body bgcolor=\"LightSlateGray \"><h3 align=center>user not found</h3>"
					+ "</body></html>");
		}else if(status==-2) {
			pw.println("<html><body bgcolor=\\\"LightSlateGray \\\"><h3>password did not match</h3></body></html>");
		}else {
			pw.println("<html><body bgcolor=\\\"LightSlateGray \\\"><h3>invalid login</h3></body></html>");
		}
		
	}

}
