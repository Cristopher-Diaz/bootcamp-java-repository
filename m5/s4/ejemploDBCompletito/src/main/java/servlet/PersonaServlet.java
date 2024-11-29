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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String opcion = request.getParameter("opcion");

		if (opcion == null) {
			opcion = "listar";
		}

		switch (opcion) {
		case "agregar":
			agregarPersona(response);
			break;
		case "listar":
			try {
				listarPersona(request, response);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			break;

		case "editar":
			try {
				editarPersona(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				e.printStackTrace();
			}
			break;

		case "eliminar":
			try {
				eliminar(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				e.printStackTrace();
			}
			break;
		}

	}

	private void editarPersona(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		Persona p = personaDAO.buscar(id);

		request.setAttribute("persona", p);

		RequestDispatcher dispatcher = request.getRequestDispatcher("editar.jsp");
		dispatcher.forward(request, response);

	}

	private void listarPersona(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {

		List<Persona> listaPersonas = personaDAO.listar();

		request.setAttribute("personas", listaPersonas);

		RequestDispatcher dispatcher = request.getRequestDispatcher("listar.jsp");
		dispatcher.forward(request, response);

	}

	private void agregarPersona(HttpServletResponse response) throws IOException {

		response.sendRedirect("agregar.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// identificar si viene de un agregar o de un editar
		String accion = request.getParameter("accion");

		// Recuperar los valores del formulario
		int id = Integer.parseInt(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		int edad = Integer.parseInt(request.getParameter("edad"));

		// Crear objeto
		Persona p = new Persona(id, nombre, edad);

		// Si viene de un agregar
		if (accion.equals("agregar")) {

			// Invocamos al método que agrega persona

			try {
				personaDAO.crearPersona(p);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// Si viene de un editar :

		if (accion.equals("editar")) {

			// Invocamos al método que actualiza persona

			try {
				personaDAO.editar(p);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		// Redirigir a la lista de personas
		response.sendRedirect("PersonaServlet?opcion=listar");
	}

	private void eliminar(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		try {
			personaDAO.eliminar(id);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Redirigir a la lista de personas
		response.sendRedirect("PersonaServlet?opcion=listar");
	}

}
