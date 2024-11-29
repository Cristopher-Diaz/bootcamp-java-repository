package utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class GeneraPoolConexion {
	private static DataSource dataSource;

    static {
        try {
            // Buscar el recurso JNDI
            Context initContext = new InitialContext();
            dataSource = (DataSource) initContext.lookup("java:/comp/env/jdbc/datos");
        } catch (NamingException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al inicializar el DataSource", e);
        }
    }

    /**
     * Obtener una conexión desde el pool
     * @return Connection
     * @throws SQLException
     */
    public static Connection getConexion() throws SQLException {
        if (dataSource == null) {
            throw new SQLException("El DataSource no ha sido inicializado correctamente.");
        }
        return dataSource.getConnection();
    }
}

