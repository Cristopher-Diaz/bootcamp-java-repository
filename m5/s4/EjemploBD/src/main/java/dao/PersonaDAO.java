package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Persona;

public class PersonaDAO {
	
	private static final String URL="jdbc:mysql://localhost:3306/simple_users_db";
	private static final String USER ="root";
	private static final String PASSWORD = "admin123";

	public Connection conectar() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
	public void crearPersona(Persona p) throws SQLException, ClassNotFoundException{
		String sql = "INSERT INTO users (first_name, last_name, age) VALUES(?,?,?)";
		
		Connection conn= null;
		PreparedStatement stmt= null;
		
		try {
	         //Cargar el driver
			 Class.forName("com.mysql.cj.jdbc.Driver");
			
			 //conectar a la BD
              conn = conectar();
             //preparar sentencia SQL
			  stmt = conn.prepareStatement(sql);
			  stmt.setString(1, p.getNombre());
			  stmt.setString(2, p.getApellido());
			  stmt.setInt(3, p.getEdad());
			  //ejecutar la query
			  stmt.execute();
  
		}catch(SQLException e) {
			e.printStackTrace();
		
		}
	}

	public List<Persona> listar() throws ClassNotFoundException {
		
		List<Persona> personas = new ArrayList<>();
		String sql = "SELECT * FROM users ORDER BY id";
		
		Connection conn= null;
		Statement stmt= null;
		
		try {
	         //Cargar el driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 //conectar a la BD
              conn = conectar();
              
              stmt = conn.createStatement();
              ResultSet rs = stmt.executeQuery(sql);
              System.out.println(rs);
              while(rs.next()) {
            	  String nombre = rs.getString("first_name");
            	  String apellido = rs.getString("last_name");
            	  int edad = rs.getInt("age");
            	  
            	  Persona p = new Persona(nombre, apellido, edad);
            	  personas.add(p);
              }
  
		}catch(SQLException e) {
			System.out.println("aaa");
			e.printStackTrace();
		
		}
		
		return personas;
		
	}


}
