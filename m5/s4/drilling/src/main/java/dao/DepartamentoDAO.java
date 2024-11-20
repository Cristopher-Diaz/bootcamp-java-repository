package dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
import model.Departamento;
import model.Usuario;
 
public class DepartamentoDAO {
	
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
		
		//definir método listar
		public List<Departamento> listar() throws ClassNotFoundException{
		
		      List<Departamento> departamentos = new ArrayList<>();
		      
		      String sql = "SELECT * FROM department";
		      try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

		          try (ResultSet rs = stmt.executeQuery()) {
			    	  while(rs.next()) {
			    		  int numero = rs.getInt("id");
			    		  String nombre = rs.getString("name");
			    		  String ubicacion = rs.getString("location");
			    		  
			    		  Departamento d = new Departamento(nombre, ubicacion);
			    		  d.setNumero(numero);
			    		  departamentos.add(d);
			    	  }
		          }
		      } catch (SQLException e) {
		          e.printStackTrace(); // Deberías mostrar el error en lugar de dejarlo vacío
		      }
		      
		       return departamentos;
		}
}
