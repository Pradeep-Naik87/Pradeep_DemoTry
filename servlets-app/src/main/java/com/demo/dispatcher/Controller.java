package com.demo.dispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data=request.getParameter("data");
		
		switch("data")
		{
		case "john"  :
		  //forward to johnServlet
		RequestDispatcher rd=request.getRequestDispatcher("john");
		rd.forward(request, response);
		break;
		
		case "peter" :
			 //forward to PeterServlet
		RequestDispatcher rd1=request.getRequestDispatcher("peter");
		rd1.forward(request, response);
		break;
		
		case "google" :
		response.sendRedirect("www.google.com");
		break;
		
		default:
			response.sendError(404);
			break;
		}
	}

}
