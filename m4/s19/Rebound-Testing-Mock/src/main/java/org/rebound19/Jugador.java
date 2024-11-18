package org.rebound19;

public class Jugador {
    private String nombre;
    private int edad;
    private int numero;

    public Jugador(String nombre, int edad, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numero=" + numero +
                '}';
    }

//    public Jugador crearJugador(String nombre, int edad, int numero) {
//        Jugador nuevoJugador = new Jugador();
//        nuevoJugador.setNombre(nombre);
//        nuevoJugador.setEdad(edad);
//        nuevoJugador.setNumero(numero);
//
//        return nuevoJugador;
//    }

    public static Jugador crearJugador(String nombre, int edad, int numero) {
        return new Jugador(nombre, edad, numero);
    }
}
