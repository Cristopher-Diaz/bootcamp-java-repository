package com.edutecno;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class InputHandlerServlet
 */
@WebServlet("/InputHandlerServlet")
public class InputHandlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputHandlerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		
		//Enviar al servlet2
		
		request.setAttribute("nombre", full_name);
		request.setAttribute("direccion", address);
		
		request.setAttribute("prodP1", prodP1);
		request.setAttribute("descP1", descP1);
		request.setAttribute("valorP1", valorP1);
		request.setAttribute("cantP1", cantP1);
		
		request.setAttribute("prodP2", prodP2);
		request.setAttribute("descP2", descP2);
		request.setAttribute("valorP2", valorP2);
		request.setAttribute("cantP2", cantP2);
		
		request.setAttribute("prodP3", prodP3);
		request.setAttribute("descP3", descP3);
		request.setAttribute("valorP3", valorP3);
		request.setAttribute("cantP3", cantP3);
		
		request.setAttribute("prodP4", prodP4);
		request.setAttribute("descP4", descP4);
		request.setAttribute("valorP4", valorP4);
		request.setAttribute("cantP4", cantP4);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ResultDisplayServlet");
		
		dispatcher.forward(request, response);
	}

}
