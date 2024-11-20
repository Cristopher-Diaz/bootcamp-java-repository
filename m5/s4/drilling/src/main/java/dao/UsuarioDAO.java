package dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
import model.Usuario;
 
public class UsuarioDAO {
	
 
	//establecer los parametros de conexión con BD
	private static final String URL="jdbc:mysql://localhost:3306/simple_users_db";
	private static final String USER ="root";
	private static final String PASSWORD = "admin123";
		
	//definir la conexión
	public Connection conectar() throws SQLException {
	    // Registrar el controlador si es necesario
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace(); // Imprime cualquier error relacionado con la carga del driver
	    }
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
		
	//definir método buscar
	public Usuario buscar(int rut, String clave) throws ClassNotFoundException{
		
      Usuario usuario = null;
//      String sql= "SELECT * FROM user_to_login WHERE rut=" + rut +" AND password= "+ clave;
      
//      Connection conn = null;
//      Statement stmt = null;
      
      String sql = "SELECT * FROM user_to_login WHERE rut = ? AND password = ?";
      try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
          stmt.setInt(1, rut);
          stmt.setString(2, clave);
          try (ResultSet rs = stmt.executeQuery()) {
              if (rs.next()) {
                  int rutUsuario = rs.getInt("rut");
                  String nombreUsuario = rs.getString("name");
                  String claveUsuario = rs.getString("password");
                  usuario = new Usuario(rutUsuario, claveUsuario, nombreUsuario);
              }
          }
      } catch (SQLException e) {
          e.printStackTrace(); // Deberías mostrar el error en lugar de dejarlo vacío
      }
      
      return usuario;
	}
	
}