package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Departamento;

import java.io.IOException;
import java.util.List;

import dao.DepartamentoDAO;


/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DepartamentoDAO departamentoDAO = new DepartamentoDAO();
       
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
		
		String opcion = request.getParameter("opcion");

		if (opcion == null) {
			opcion = "listar";
		}

		switch (opcion) {
		
		case "listar": listarDepartamento(request, response);
			           break;
		}
	}

	private void listarDepartamento(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		List<Departamento> departamentos = departamentoDAO.listar();

		request.setAttribute("departamentos", departamentos);

		RequestDispatcher dispatcher = request.getRequestDispatcher("listar.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accion = request.getParameter("accion");
		
        switch (accion) {
		
		case "filtroNombre":  filtroNombre(request, response);
			                  break;
		}
		
	}

	private void filtroNombre(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
		String nombre = request.getParameter("nombre");
		
		List<Departamento> deptoFiltrado = departamentoDAO.filtroNombre(nombre);
		
		request.setAttribute("departamentos", deptoFiltrado);

		RequestDispatcher dispatcher = request.getRequestDispatcher("listar.jsp");
		dispatcher.forward(request, response);
	}

}
