package tienda;

import java.util.ArrayList;

public class Coleccion {
    private ArrayList<Producto> productos;

    public Coleccion() {
        this.productos = new ArrayList<>();
    }

    public String verProductos() {
        String res = "";
        if (productos.isEmpty()) {
            res = "No hay productos disponibles.";
            return res;
        }
        for (int i = 0; i < productos.size(); i++) {
            res += (i + 1) + ". " + productos.get(i) + "\n";
        }
        return res;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado exitosamente.");
    }

    public void modificarProducto(int indice, Producto nuevoProducto) {
        if (indice >= 0 && indice < productos.size()) {
            productos.set(indice, nuevoProducto);
            System.out.println("Producto modificado exitosamente.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public void eliminarProducto(int indice) {
        if (indice >= 0 && indice < productos.size()) {
            productos.remove(indice);
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("Índice no válido.");
        }
    }
}
