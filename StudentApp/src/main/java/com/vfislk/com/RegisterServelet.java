package com.vfislk.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServelet
 */
@WebServlet("/register")
public class RegisterServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String username = request.getParameter("username");
//		String studentId = request.getParameter("studentId");
//		int id =Integer.parseInt(studentId);
		int id=Integer.parseInt(request.getParameter("studentId"));
		String city =request.getParameter("city");
		String language = request.getParameter("language");
		String hobbies[] = request.getParameterValues("hobby");
		
		out.print("<html><body>");
		out.print("Welcome "+username);
		out.print(" student id is "+id);
		out.print(" city is "+city);
		out.print(" language is "+language);
		Stream.of(hobbies).forEach(out::print);
		
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
