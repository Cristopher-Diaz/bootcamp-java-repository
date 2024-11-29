package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Pedido;

import java.io.IOException;
import java.util.List;

import dao.PedidoDAO;


/**
 * Servlet implementation class TiendaServlet
 */
@WebServlet("/TiendaServlet")
public class TiendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PedidoDAO pedidoDAO = new PedidoDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TiendaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String opcion = request.getParameter("opcion");

		if (opcion == null) {
			opcion = "listar";
		}

		switch (opcion) {
		
		case "listar": listarPedidos(request, response);
	
			break;
		}

	}

	private void listarPedidos(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
		List<Pedido> pedidos = pedidoDAO.listarPedidos();

		request.setAttribute("pedidos", pedidos);

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
