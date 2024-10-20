package com.ejerciciosClase;

public class Vehiculo  implements IVehiculo{
    protected String marca;
    protected int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarDetalles() {
        System.out.println("La marca es: " + marca);
        System.out.println("La velocidad maxima es: " + velocidadMaxima + " km/h");
        int maximo = IVehiculo.MAX_VELOCIDAD;
        System.out.println("Velocidad Max" + maximo);
    }
}
