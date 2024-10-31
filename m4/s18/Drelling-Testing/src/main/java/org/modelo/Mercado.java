package org.modelo;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private List<Producto> productos;

    public Mercado() {
        this.productos = new ArrayList<>();
    }

    public String publicarAviso( Producto producto) {
        productos.add(producto);
        return "El producto se ha subido al mercado en linea";
    }

    public String verTodoAviso () {
        String out = "Los productos disponibles en el mercado ahora son: \n";
        for (Producto temp : productos) {
            out = out + temp.toString() + "\n";
        }
        return out;
    }
}
