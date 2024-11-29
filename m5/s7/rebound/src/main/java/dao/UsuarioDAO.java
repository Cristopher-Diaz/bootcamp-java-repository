package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuarioDAO {
	private static final String URL="jdbc:mysql://localhost:3306/simple_users_db";
	private static final String USER ="root";
	private static final String PASSWORD = "admin123";

	public void probarConexion() {
	    try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
	        if (conn != null) {
	            System.out.println("Conexión exitosa.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public Connection conectar() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
	public List<Usuario> listar() throws ClassNotFoundException {
		
		List<Usuario> usuarios = new ArrayList<>();
		String sql="select * from users_m5_s7_rebound";
		
		Connection conn= null;
		Statement stmt= null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 //conectar a la BD
		      conn = conectar();
              
              stmt = conn.createStatement();
              ResultSet rs = stmt.executeQuery(sql);
              
              while(rs.next()) {
            	  int id = rs.getInt("id");
            	  String nombre = rs.getString("name");
            	  String clave = rs.getString("password");
            	  int rut = rs.getInt("rut");
            	  String dv = rs.getString("dv");
            	  
            	  Usuario u = new Usuario(id, nombre, clave, rut, dv);
            	  usuarios.add(u);
              }
  
		}catch(SQLException e) {
			e.printStackTrace();
		
		}
		
		return usuarios;
		
	}

}
