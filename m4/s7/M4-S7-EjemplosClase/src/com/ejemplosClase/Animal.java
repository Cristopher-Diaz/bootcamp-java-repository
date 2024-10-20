package com.ejemplosClase;

public class Animal {
    protected String nombre;
    protected String raza;

    public Animal(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    public void comer() {
        System.out.println("El animal esta comiendo");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
}
