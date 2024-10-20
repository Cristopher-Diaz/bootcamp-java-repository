package modelo;

import interfaces.ProductoInterface;

public class Refrigerador extends Producto implements ProductoInterface {
    private char gasto_electrico;
    private int n_puertas;

    public Refrigerador(double precio, int cantidad, char gasto_electrico, int n_puertas) {
        super(precio, cantidad);
        this.gasto_electrico = gasto_electrico;
        this.n_puertas = n_puertas;
    }

    @Override
    public void cambiarPrecio() {

    }

    @Override
    public int mostrarCantidadDisponible() {

        return cantidad;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("El gasto electrico es: " + gasto_electrico);
        System.out.println("Cuenta con: " + n_puertas + " puertas");
    }
}
