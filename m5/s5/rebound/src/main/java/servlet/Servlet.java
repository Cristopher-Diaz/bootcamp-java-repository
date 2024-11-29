package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dto.Role;
import dto.User;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("roles", Arrays.asList(Role.values()));
		request.getRequestDispatcher("registro.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Recuperar valores del formulario 
		String nombre = request.getParameter("nombre");
		String userName = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String rol = request.getParameter("rol");
		
		Role role = Role.ROLE_ADMIN.valueOf(rol);
		List<Role> roles = new ArrayList();
		roles.add(role);
		
		User userDTOUser = new User(nombre, userName, email, password, roles);
		
		request.setAttribute("nombre", nombre);
		request.setAttribute("userName", userName);
		request.setAttribute("email", email);
		
		request.getRequestDispatcher("confirmacion.jsp").forward(request, response);
		
	}

}
