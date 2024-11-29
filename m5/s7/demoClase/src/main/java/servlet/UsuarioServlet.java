package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Usuario;

import java.io.IOException;
import java.util.List;

import dao.UsuarioDAO;

/**
 * Servlet implementation class UsuarioServlet
 */
@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String opcion = request.getParameter("opcion");

		if (opcion == null) {
			opcion = "listar";
		}
		
		switch (opcion) {
		case "listar":
			try {
				listarPersona(request, response);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			break;
		}
	}

	private void listarPersona(HttpServletRequest request, HttpServletResponse response) 
			throws ClassNotFoundException, ServletException, IOException{
		
		List<Usuario> listaUsuarios = usuarioDAO.listar();

		request.setAttribute("usuarios", listaUsuarios);

		RequestDispatcher dispatcher = request.getRequestDispatcher("listar.jsp");
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
