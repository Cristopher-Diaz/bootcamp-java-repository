package com.ejemplosClase;

public class Perro extends Animal{
    private String color;

    public Perro(String nombre, String raza, String color) {
        super(nombre, raza);
        this.color = color;
    }

    //    Sobrescritura del metodo del padre
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    public void correr() {
        System.out.println("El perro esta corriendo");
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + super.nombre + '\'' +
                ", raza='" + super.raza + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void imprimirComer(){
        super.comer();
    }
}
