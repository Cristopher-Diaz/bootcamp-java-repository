package com.evam5s3;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class ProcesaLogin
 */
@WebServlet("/ProcesaLogin")
public class ProcesaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProcesaLogin() {
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
		
		//Usuario y contraseña simulado
		String usuarioValido = "fcorrea";
		String claveValida= "12345";
		String nombre = "Francisco Correa";
		
		//Recuperar valor del formulario
		String usuario = request.getParameter("user");
		String clave = request.getParameter("pass");
		
		//Verificar si el usuario y clave son correctos
		if(usuario.equals(usuarioValido) && clave.equals(claveValida)) {
			//Ingreso correcto
			//Crear la sesión
			HttpSession session = request.getSession(true);
			//Dejar el nombre del usuario en la sesión
			session.setAttribute("usuario", nombre);
			
			//llamar a areaPrivada.jsp
			RequestDispatcher dispatcher = request.getRequestDispatcher("areaPrivada.jsp");
			dispatcher.forward(request, response);
			
		}else {
			//Ingreso fallido
			request.setAttribute("msjError", "Usuario o contraseña inválida");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}

}
