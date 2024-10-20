package com.ejerciciosClase;

public class Moto extends Vehiculo{
    private String color;

    public Moto(String marca, int velocidadMaxima, String color) {
        super(marca, velocidadMaxima);
        this.color = color;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("El color es: " + color);
    }
}
