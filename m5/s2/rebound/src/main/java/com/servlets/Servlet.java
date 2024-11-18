package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet() {
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
		
		String password = request.getParameter("password");
		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
		
//		out.println("<h1> Bienbenidoooo" + password + "</h1>");
		String output = "";
		boolean isStrongPassword = verifyIsStrongPassword(password);
		if (isStrongPassword) {
			output = "La contraseña es fuerte";
		} else {
			output = "La contraseña es débil";
		}
		
        request.setAttribute("isStrongPassword", isStrongPassword);
        request.setAttribute("password", password);
        request.setAttribute("message", output);

        request.getRequestDispatcher("Respuesta.jsp").forward(request, response);
		

	}
	
	protected boolean verifyIsStrongPassword(String password) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;

        if (password != null) {
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    upperCaseCount++;
                } else if (Character.isLowerCase(c)) {
                    lowerCaseCount++;
                } else if (Character.isDigit(c)) {
                    digitCount++;
                }
            }
        }
        System.out.println(upperCaseCount);
        System.out.println(lowerCaseCount);
        System.out.println(digitCount);
        
//        boolean isStrongPassword = (upperCaseCount >= 4 && lowerCaseCount >= 3 && digitCount >= 3);
        return (upperCaseCount >= 4 && lowerCaseCount >= 3 && digitCount >= 3);
	}

}
