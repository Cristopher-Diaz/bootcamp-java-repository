package modelo;

import interfaces.CocinaInterface;

public class Cocina extends Producto implements CocinaInterface {
    private int n_quemadores;
    private boolean incluye_gas;

    public Cocina(double precio, int cantidad, int n_quemadores, boolean incluye_gas) {
        super(precio, cantidad);
        this.n_quemadores = n_quemadores;
        this.incluye_gas = incluye_gas;
    }

    @Override
    public void incluyeGas(boolean incluye_gas) {
        this.incluye_gas = incluye_gas;
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
        System.out.println("Cuenta con: " + n_quemadores + " quemadores");
    }
}
