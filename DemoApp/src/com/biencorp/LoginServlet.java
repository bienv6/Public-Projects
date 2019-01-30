package com.biencorp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		int uid = Integer.parseInt(request.getParameter("uid"));
		int pwd = Integer.parseInt(request.getParameter("pwd"));
		request.setAttribute("id", uid);
		request.setAttribute("password", pwd);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/homepage.jsp");
		dispatcher.forward(request, response);
	}
}
