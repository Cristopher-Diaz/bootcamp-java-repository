package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Departamento;
import model.Ubicacion;
import utils.GeneraPoolConexion;

public class DepartamentoDAO {

	public List<Departamento> listar() {

		List<Departamento> departamentos = new ArrayList<>();
		String sql = "SELECT \r\n" + "NUMDEPTO,\r\n" + "INITCAP(NOMDEPTO) AS NOMDEPTO,\r\n"
				+ "INITCAP(NOMBRE) AS NOMBRE\r\n" + "FROM DEPARTAMENTO JOIN UBICACION\r\n" + "ON(UBICACIONDPTO = ID)";

		Connection conn = null;
		Statement stmt = null;

		try {

			// conectar a la BD
			conn = GeneraPoolConexion.getConexion();

			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int numero = rs.getInt("numdepto");
				String nombre = rs.getString("nomdepto");
				String nombreUbicacion = rs.getString("nombre");

				Ubicacion u = new Ubicacion(nombreUbicacion);
				Departamento d = new Departamento(numero, nombre, u);
				departamentos.add(d);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return departamentos;

	}

	public List<Departamento> filtroNombre(String nombre) {
		List<Departamento> departamentos = new ArrayList<>();
		String sql = "SELECT \r\n"
				+ "NUMDEPTO,\r\n"
				+ "INITCAP(NOMDEPTO) AS NOMDEPTO,\r\n"
				+ "INITCAP(NOMBRE) AS NOMBRE\r\n"
				+ "FROM DEPARTAMENTO JOIN UBICACION\r\n"
				+ "ON(UBICACIONDPTO = ID)\r\n"
				+ "WHERE nomdepto = '" + nombre.toUpperCase() + "'";

		Connection conn = null;
		Statement stmt = null;

		try {

			// conectar a la BD
			conn = GeneraPoolConexion.getConexion();

			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int numero = rs.getInt("numdepto");
				String nombreDepto = rs.getString("nomdepto");
				String nombreUbicacion = rs.getString("nombre");

				Ubicacion u = new Ubicacion(nombreUbicacion);
				Departamento d = new Departamento(numero, nombreDepto, u);
				departamentos.add(d);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return departamentos;
	}
	
	public List<Departamento> filtroNumero(int num) {
		List<Departamento> departamentos = new ArrayList<>();
		String sql = "SELECT \r\n"
				+ "NUMDEPTO,\r\n"
				+ "INITCAP(NOMDEPTO) AS NOMDEPTO,\r\n"
				+ "INITCAP(NOMBRE) AS NOMBRE\r\n"
				+ "FROM DEPARTAMENTO JOIN UBICACION\r\n"
				+ "ON(UBICACIONDPTO = ID)\r\n"
				+ "WHERE numdepto =" + num;

		Connection conn = null;
		Statement stmt = null;

		try {

			// conectar a la BD
			conn = GeneraPoolConexion.getConexion();

			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int numero = rs.getInt("numdepto");
				String nombreDepto = rs.getString("nomdepto");
				String nombreUbicacion = rs.getString("nombre");

				Ubicacion u = new Ubicacion(nombreUbicacion);
				Departamento d = new Departamento(numero, nombreDepto, u);
				departamentos.add(d);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return departamentos;
	}

	public List<String> getUbicaciones(){
		
		List<String> ubicaciones = new ArrayList<>();
		
		String sql = "select nombre from ubicacion";

		Connection conn = null;
		Statement stmt = null;

		try {

			// conectar a la BD
			conn = GeneraPoolConexion.getConexion();

			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String nombre = rs.getString("nombre");
				
				ubicaciones.add(nombre);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return ubicaciones;
	}

	public List<Departamento> filtroUbicacion(String ubicacion) {
		List<Departamento> departamentos = new ArrayList<>();
		String sql = "SELECT \r\n"
				+ "NUMDEPTO,\r\n"
				+ "INITCAP(NOMDEPTO) AS NOMDEPTO,\r\n"
				+ "INITCAP(NOMBRE) AS NOMBRE\r\n"
				+ "FROM DEPARTAMENTO JOIN UBICACION\r\n"
				+ "ON(UBICACIONDPTO = ID)\r\n"
				+ "WHERE nombre = '" + ubicacion.toUpperCase() + "'";

		Connection conn = null;
		Statement stmt = null;

		try {

			// conectar a la BD
			conn = GeneraPoolConexion.getConexion();

			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int numero = rs.getInt("numdepto");
				String nombreDepto = rs.getString("nomdepto");
				String nombreUbicacion = rs.getString("nombre");

				Ubicacion u = new Ubicacion(nombreUbicacion);
				Departamento d = new Departamento(numero, nombreDepto, u);
				departamentos.add(d);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return departamentos;
	}
	
}
