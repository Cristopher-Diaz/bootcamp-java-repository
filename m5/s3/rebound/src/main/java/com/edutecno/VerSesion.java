package com.edutecno;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class VerSesion
 */
@WebServlet("/VerSesion")
public class VerSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerSesion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//obtener la sesión existente
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			//Recuperar atributo de la sesión
			Producto p = (Producto) session.getAttribute("producto");
			
			//Impresión de producto
			PrintWriter pw = response.getWriter();  
			pw.println("<html><body><p>id: " + p.getId() + ",<br>");
			pw.println("Concepto: " + p.getConcepto() + ", <br>");
			pw.println("Importe: " + p.getImporte() + ". <br>");
			pw.println("Datos del objeto producto generado manualmente en Servlet CrearSession</p></body></html>");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
