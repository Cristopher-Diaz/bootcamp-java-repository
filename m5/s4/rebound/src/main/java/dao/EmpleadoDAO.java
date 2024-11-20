package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Empleado;

public class EmpleadoDAO {
	private static final String URL="jdbc:mysql://localhost:3306/simple_users_db";
	private static final String USER ="root";
	private static final String PASSWORD = "admin123";
	
	public Connection conectar() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
	public void probarConexion() {
	    try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
	        if (conn != null) {
	            System.out.println("Conexión exitosa.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public List<Empleado> listar() throws ClassNotFoundException {
		
		List<Empleado> empleados = new ArrayList<>();
		String sql = "SELECT * FROM employees ORDER BY id";
		
		Connection conn= null;
		Statement stmt= null;
		System.out.println(sql);
		
	      try {
	    	  System.out.println("dd");
	    	  //Cargar driver
	    	  Class.forName("com.mysql.cj.jdbc.Driver");
	    	  //conectar con BD
	    	  conn = conectar();
	    	  System.out.println(conn);
	    	  //ejecutar sentencia
	    	  stmt = conn.createStatement();
	    	  System.out.println(stmt);
	    	  ResultSet rs = stmt.executeQuery(sql);
	    	  System.out.println("aaaa");
	    	  //llenar arraylist con resultados de consulta
	    	  while(rs.next()) {
	    		  int id = rs.getInt("id");
	    		  String nombre = rs.getString("full_name");
	    		  
	    		  Empleado e = new Empleado(nombre);
	    		  e.setId(id);
	    		  empleados.add(e);
	    	  }
	    	   
	      } catch(SQLException e) {
	    	  e.printStackTrace();
	      }
		
		return empleados;
		
	}
}
