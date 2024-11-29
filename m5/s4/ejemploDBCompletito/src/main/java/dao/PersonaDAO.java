package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Persona;
import utils.GeneraPoolConexion;

public class PersonaDAO {
	
	public void crearPersona(Persona p) throws SQLException, ClassNotFoundException{
		String sql= "INSERT INTO PERSONA (id, nombre, edad) VALUES(?,?,?)";
		
		Connection conn= null;
		PreparedStatement stmt= null;
		
		try {
			 //conectar a la BD
              conn = GeneraPoolConexion.getConexion();
             //preparar sentencia SQL
			  stmt = conn.prepareStatement(sql);
			  stmt.setInt(1, p.getId());
			  stmt.setString(2, p.getNombre());
			  stmt.setInt(3, p.getEdad());
			  //ejecutar la query
			  stmt.execute();
  
		}catch(SQLException e) {
			e.printStackTrace();
		
		}
	}

	public List<Persona> listar() throws ClassNotFoundException {
		
		List<Persona> personas = new ArrayList<>();
		String sql="select * from persona order by 2";
		
		Connection conn= null;
		Statement stmt= null;
		
		try {
	         //conectar a la BD
			  conn = GeneraPoolConexion.getConexion();
              stmt = conn.createStatement();
              ResultSet rs = stmt.executeQuery(sql);
              
              while(rs.next()) {
            	  int id = rs.getInt("id");
            	  String nombre = rs.getString("nombre");
            	  int edad = rs.getInt("edad");
            	  
            	  Persona p = new Persona(id, nombre, edad);
            	  personas.add(p);
              }
  
		}catch(SQLException e) {
			e.printStackTrace();
		
		}
		
		return personas;
		
	}

    public Persona buscar(int idPersona) throws ClassNotFoundException {
		
		String sql="select * from persona where id=" + idPersona;
		
		Connection conn= null;
		Statement stmt= null;
		Persona p=null;
		
		try {
			 //conectar a la BD
			  conn = GeneraPoolConexion.getConexion();
              stmt = conn.createStatement();
              ResultSet rs = stmt.executeQuery(sql);
              
              while(rs.next()) {
            	  int id = rs.getInt("id");
            	  String nombre = rs.getString("nombre");
            	  int edad = rs.getInt("edad");
            	  
            	  p = new Persona(id, nombre, edad);
              }
  
		}catch(SQLException e) {
			e.printStackTrace();
		
		}
		
		return p;
		
	}
    
    public void editar(Persona p) throws SQLException, ClassNotFoundException{
		String sql= "UPDATE PERSONA SET nombre='" + p.getNombre() + "', edad=" + p.getEdad() +" where id=" + p.getId();
		
		Connection conn= null;
		PreparedStatement stmt= null;
		
		try {
			 //conectar a la BD
			   conn = GeneraPoolConexion.getConexion();
             //preparar sentencia SQL
			  stmt = conn.prepareStatement(sql);
			  //ejecutar la query
			  stmt.execute();
  
		}catch(SQLException e) {
			e.printStackTrace();
		
		}
	}

    public void eliminar(int id) throws SQLException, ClassNotFoundException{
		String sql= "DELETE FROM PERSONA WHERE id=" + id;
		
		Connection conn= null;
		PreparedStatement stmt= null;
		
		try {
			 //conectar a la BD
			   conn = GeneraPoolConexion.getConexion();
             //preparar sentencia SQL
			  stmt = conn.prepareStatement(sql);
			  //ejecutar la query
			  stmt.execute();
  
		}catch(SQLException e) {
			e.printStackTrace();
		
		}
	}

}
