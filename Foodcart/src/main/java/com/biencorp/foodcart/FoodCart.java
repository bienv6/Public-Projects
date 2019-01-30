package com.biencorp.foodcart;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FoodCart")
public class FoodCart extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 873086715066367262L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// get data from database
		String[] foodItems = { "pizza", "ice cream", "hot dogs", "hamburger" };
		request.setAttribute("fItems", foodItems);

		// redirect info to the view
		RequestDispatcher dispatcher = request.getRequestDispatcher("show-food.jsp");
		dispatcher.forward(request, response);
	}

}
