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

        List<Departamento> departments = new ArrayList<>();
        String sql = """
                SELECT 
                    d.department_number, 
                    d.department_name, 
                    l.name AS location_name
                FROM m5_s8_department d
                JOIN m5_s8_location l ON d.location_id = l.id
                WHERE d.deleted_at IS NULL
                """;

        try (Connection conn = GeneraPoolConexion.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int departmentNumber = rs.getInt("department_number");
                String departmentName = rs.getString("department_name");
                String locationName = rs.getString("location_name");

                Ubicacion location = new Ubicacion(locationName);
                Departamento department = new Departamento(departmentNumber, departmentName, location);
                departments.add(department);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departments;
    }

    public List<Departamento> filtroNombre(String name) {
        List<Departamento> departments = new ArrayList<>();
        String sql = """
        	    SELECT 
        	        d.department_number, 
        	        d.department_name, 
        	        l.name AS location_name
        	    FROM m5_s8_department d
        	    JOIN m5_s8_location l ON d.location_id = l.id
        	    WHERE d.deleted_at IS NULL 
        	      AND d.department_name = '%s'
        	    """.formatted(name.toUpperCase());

        try (Connection conn = GeneraPoolConexion.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int departmentNumber = rs.getInt("department_number");
                String departmentName = rs.getString("department_name");
                String locationName = rs.getString("location_name");

                Ubicacion location = new Ubicacion(locationName);
                Departamento department = new Departamento(departmentNumber, departmentName, location);
                departments.add(department);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departments;
    }
}
