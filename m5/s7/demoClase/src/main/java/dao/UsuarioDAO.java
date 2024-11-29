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

	private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER ="appusuario";
	private static final String PASSWORD = "12345";

	public Connection conectar() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
public List<Usuario> listar() throws ClassNotFoundException {
		
		List<Usuario> usuarios = new ArrayList<>();
		String sql="select * from usuario";
		
		Connection conn= null;
		Statement stmt= null;
		
		try {
	         //Cargar el driver
			 Class.forName("oracle.jdbc.OracleDriver");
			
			 //conectar a la BD
              conn = conectar();
              
              stmt = conn.createStatement();
              ResultSet rs = stmt.executeQuery(sql);
              
              while(rs.next()) {
            	  int id = rs.getInt("id_usuario");
            	  String nombre = rs.getString("nombre");
            	  String clave = rs.getString("clave");
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
