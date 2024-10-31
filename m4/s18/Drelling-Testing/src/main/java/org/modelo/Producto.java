package org.modelo;

public class Producto {
    private String nombre;
    private int idProducto;
    private String condicion;
    private String Precio;

    public Producto(String nombre, int idProducto, String condicion, String precio) {
        this.nombre = nombre;
        this.idProducto = idProducto;
        this.condicion = condicion;
        Precio = precio;
    }

    public Producto crearAviso (String nombre, int idProducto, String condicion, String precio) {
        Producto aviso = new Producto(nombre, idProducto, condicion, precio);
        return aviso;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", idProducto=" + idProducto +
                ", condicion='" + condicion + '\'' +
                ", Precio='" + Precio + '\'' +
                '}';
    }
}
