package modelo;

public class Producto {
    protected double precio;
    protected int cantidad;

    public Producto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void mostrarDetalles() {
        System.out.println("Precio: " + precio);
        System.out.println("Unidades disponibles: " + cantidad);
    }
}
