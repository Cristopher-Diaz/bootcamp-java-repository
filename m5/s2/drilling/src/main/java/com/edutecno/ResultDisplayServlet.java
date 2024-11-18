package com.edutecno;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ResultDisplayServlet
 */
@WebServlet("/ResultDisplayServlet")
public class ResultDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResultDisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Recuperar variables desde el servlet que lee los inputs
		String full_name = request.getParameter("full_name");
		String address = request.getParameter("address");
		
		//Recuperar el valor de cada celda de la tabla
		String prodP1 = request.getParameter("prodP1");
		String descP1 = request.getParameter("descP1");
		String valorP1 = request.getParameter("valorP1");
		String cantP1 = request.getParameter("cantP1");
		
		String prodP2 = request.getParameter("prodP2");
		String descP2 = request.getParameter("descP2");
		String valorP2 = request.getParameter("valorP2");
		String cantP2 = request.getParameter("cantP2");
		
		String prodP3 = request.getParameter("prodP3");
		String descP3 = request.getParameter("descP3");
		String valorP3 = request.getParameter("valorP3");
		String cantP3 = request.getParameter("cantP3");
		
		String prodP4 = request.getParameter("prodP4");
		String descP4 = request.getParameter("descP4");
		String valorP4 = request.getParameter("valorP4");
		String cantP4 = request.getParameter("cantP4");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
