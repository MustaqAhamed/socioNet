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
 * Servlet implementation class SignupServlet
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		String uname= request.getParameter("uname");
		String pword= request.getParameter("pword");
		String department= request.getParameter("department");
		String year= request.getParameter("year");
		String dob= request.getParameter("dob");
		String gender= request.getParameter("gender");
		int status= 0;
		DBHelper db = new DBHelper();
		status= db.newUser(fname,lname,uname,pword,department,year,dob,gender);
		if(status==1) {
			RequestDispatcher rd = request.getRequestDispatcher("page1.jsp");
			rd.forward(request, response);
		}else {
			pw.println("<html><h3>Error Occured</h3></html>");
	}

}}
