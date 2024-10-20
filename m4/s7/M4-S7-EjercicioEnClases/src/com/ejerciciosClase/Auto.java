package com.ejerciciosClase;

public class Auto extends Vehiculo{
    private int n_puertas;

    public Auto(String marca, int velocidadMaxima, int n_puertas) {
        super(marca, velocidadMaxima);
        this.n_puertas = n_puertas;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("El numero de puertas es: " + n_puertas);
    }
}
