package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Pedido;
import utils.GeneraPoolConexion;

public class PedidoDAO {

    public List<Pedido> listarPedidos() {
        List<Pedido> pedidos = new ArrayList<>();

        // Consulta SQL ajustada para MySQL
        String sql = """
            SELECT 
                c.id AS customer_id,
                o.id AS order_id,
                UPPER(c.name) AS name,
                c.email AS email,
                DATE_FORMAT(o.date, '%d/%m/%Y') AS formatted_date,
                o.amount AS amount
            FROM m5_s8_customers c
            JOIN m5_s8_orders o ON c.id = o.customer_id
            WHERE c.deleted_at IS NULL AND o.deleted_at IS NULL;
        """;

        // Uso de try-with-resources para cerrar automáticamente los recursos
        try (Connection conn = GeneraPoolConexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            // Iterar sobre el ResultSet y mapear los datos
            while (rs.next()) {
                int customerId = rs.getInt("customer_id");
                int orderId = rs.getInt("order_id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String formattedDate = rs.getString("formatted_date");
                int amount = rs.getInt("amount");

                // Crear el objeto Cliente
                Cliente cliente = new Cliente(customerId, name, email);

                // Crear el objeto Pedido
                Pedido pedido = new Pedido(orderId, formattedDate, amount, cliente);

                // Agregar el pedido a la lista
                pedidos.add(pedido);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pedidos;
    }
}

