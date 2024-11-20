package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Persona;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import dao.PersonaDAO;

/**
 * Servlet implementation class PersonaServlet
 */
@WebServlet("/PersonaServlet")
public class PersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PersonaDAO personaDAO = new PersonaDAO();
    /**
     * Default constructor. 
     */
    public PersonaServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String opcion = request.getParameter("opcion");
		
		if(opcion == null) {
			opcion = "listar";
		}
		
		switch(opcion) {
		    case "agregar" : agregarPersona(response);
		                      break;
		    case "listar" : try {
				                 listarPersona(request, response);
			                    } catch (ClassNotFoundException e) {
				                  e.printStackTrace();
			                    }
		                         break;
		}
		
	}

	private void listarPersona(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, ServletException, IOException {
		
		System.out.println("Antes del error");
		List<Persona> listaPersonas = personaDAO.listar();
		System.out.println(listaPersonas);
		
		request.setAttribute("personas", listaPersonas);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar.jsp");
		dispatcher.forward(request, response);
		
		
	}

	private void agregarPersona(HttpServletResponse response) throws IOException {
		
		response.sendRedirect("agregar.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  //Recuperar los valores del formulario
       String nombre = request.getParameter("nombre");
       String apellido = request.getParameter("apellido");
       int edad = Integer.parseInt(request.getParameter("edad"));
	
       //Crear objeto
       Persona p = new Persona(nombre, apellido, edad);
       System.out.println(p);
       //Invocamos al método que agrega persona

		try {
			personaDAO.crearPersona(p);
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		// Redirigir a la lista de personas
        response.sendRedirect("PersonaServlet?opcion=listar");
	}

}
