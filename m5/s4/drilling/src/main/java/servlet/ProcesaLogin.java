package servlet;
 
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Departamento;
import model.Usuario;
 
import java.io.IOException;
import java.util.List;

import dao.DepartamentoDAO;
import dao.UsuarioDAO;
 
/**
* Servlet implementation class ProcesaLogin
*/
@WebServlet("/ProcesaLogin")
public class ProcesaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	private DepartamentoDAO departamentoDAO = new DepartamentoDAO();
 
	/**
	 * Default constructor.
	 */
	public ProcesaLogin() {
		// TODO Auto-generated constructor stub
	}
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
 
		// Recuperar valor del formulario
		int rut = Integer.parseInt(request.getParameter("user"));
		String clave = request.getParameter("pass");
 
		Usuario u = null;
		Departamento d = null;
		// Consultamos con BD
		try {
			
			u = usuarioDAO.buscar(rut, clave);
			
		} catch (ClassNotFoundException e) {
		}
 
		// Verificar si el usuario y clave son correctos
		if (u != null) {
			// Ingreso correcto
			// Crear la sesión
			HttpSession session = request.getSession(true);
			// Dejar el nombre del usuario en la sesión
			session.setAttribute("usuario", u.getNombre());
			List<Departamento> departamentos = null;
			try {
				departamentos = departamentoDAO.listar();
			} catch (ClassNotFoundException e) {
			}
			session.setAttribute("departamentos", departamentos);
 
			// llamar a areaPrivada.jsp
			RequestDispatcher dispatcher = request.getRequestDispatcher("areaPrivada.jsp");
			dispatcher.forward(request, response);
 
		} else {
			// Ingreso fallido
			request.setAttribute("msjError", "Usuario o contraseña inválida");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}
 
	}
 
}
