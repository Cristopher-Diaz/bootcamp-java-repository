package com.ejemplo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.ejemplo.model.Producto;
import com.ejemplo.model.ProductoDAO;

public class ProductoController extends HttpServlet {

	private ProductoDAO productoDAO;

	@Override
	public void init() throws ServletException {
		productoDAO = new ProductoDAO();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String opcion = request.getParameter("opcion");

		if (opcion == null) {
			opcion = "listar";
		}

		switch (opcion) {
		case "agregar":
			agregarProducto(response);
			break;
		case "listar":
			try {
				listarProducto(request, response);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			break;
		}

	}

	private void listarProducto(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {

		List<Producto> productos = productoDAO.listar();
		request.setAttribute("productos", productos);
		request.getRequestDispatcher("listar.jsp").forward(request, response);

	}

	private void agregarProducto(HttpServletResponse response) throws IOException {

		response.sendRedirect("agregar.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Recuperar los valores del formulario
		String nombre = request.getParameter("nombre");
		int precio = Integer.parseInt(request.getParameter("precio"));

		// Crear objeto
		Producto p = new Producto(nombre, precio);

		// Invocamos al método que agrega producto
		productoDAO.agregar(p);

		// Redirigir a la lista de personas
		response.sendRedirect("productos?opcion=listar");
	}
}
