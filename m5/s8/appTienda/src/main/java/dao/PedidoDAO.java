package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Pedido;
import utils.GeneraPoolConexion;

public class PedidoDAO {

	public List<Pedido> listarPedidos(){
	
	List<Pedido> pedidos = new ArrayList<>();
	
	String sql = "SELECT \r\n"
			+ "c.id as id,\r\n"
			+ "p.id as id_pedido,\r\n"
			+ "UPPER(c.nombre) as nombre,\r\n"
			+ "c.correo as correo,\r\n"
			+ "to_char(p.fecha, 'dd/mm/yyyy') as fecha,\r\n"
			+ "to_char(p.monto, '$999g999') as monto\r\n"
			+ "FROM CLIENTE c JOIN PEDIDO p\r\n"
			+ "ON c.id = p.id_cliente";
	
	Connection conn= null;
	Statement stmt= null;
	
	try {
         //conectar a la BD
		  conn = GeneraPoolConexion.getConexion();
          stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(sql);
          
          while(rs.next()) {
        	  int id = rs.getInt("id");
        	  int id_pedido = rs.getInt("id_pedido");
        	  String nombre = rs.getString("nombre");
        	  String correo = rs.getString("correo");
        	  String fecha = rs.getString("fecha");
        	  String monto = rs.getString("monto");
        	  
        	  Cliente cliente = new Cliente(id, nombre, correo);
        	  
        	  Pedido p = new Pedido(id_pedido, fecha, monto, cliente);
        	  
        	  pedidos.add(p);
          }

	}catch(SQLException e) {
		e.printStackTrace();
	
	}
	
	
	return pedidos;
	
	}
	
}
