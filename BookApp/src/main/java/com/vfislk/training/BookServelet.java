package com.vfislk.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookServelet
 */
@WebServlet("/bookServelet")
public class BookServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServelet() {
        super();
        // 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out= response.getWriter();
	
	String name = request.getParameter("name");
//	String bookId =request.getParameter("bookId");
	int bookId=Integer.parseInt(request.getParameter("bookId"));
	String author = request.getParameter("author");
	String category = request.getParameter("category");
//	String price = request.getParameter("price");
	double price=Double.parseDouble(request.getParameter("price"));
	
// set the attribute to send to the next Jsp
	request.setAttribute("bookname", name);
	request.setAttribute("bookId", bookId);
	request.setAttribute("authorname", author);
	request.setAttribute("category", category);
	request.setAttribute("bookprice", price);
	
	RequestDispatcher dispatcher= request.getRequestDispatcher("success.jsp");
	dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
