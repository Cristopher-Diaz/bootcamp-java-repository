import datos.Coleccion;
import modelo.Socio;

import java.util.Scanner;

public class Main {
    static Coleccion c = new Coleccion();
    static Scanner read = new Scanner(System.in);

    private static boolean menu() throws Exception {
        boolean bucle = true;
        System.out.println("Socios en sistema: " + c.mostrarSocios());
        System.out.println("Numero de socios: " + c.cantidadActualDeSocios());
        System.out.println("Opciones");
        System.out.println("1. Ingresar nuevo socio");
        System.out.println("2. Salir");
        int opt = read.nextInt();

        switch (opt) {
            case 1: ingresarSocio();
                break;
            case 2: bucle = false;
                break;
        }
        return bucle;
    }

    private static void ingresarSocio() throws Exception {
        System.out.println("Si desea incorporarse al club solicitamos los siguientes datos: ");
        System.out.println("Nombre:");
        String nombre = read.next();
        System.out.println("Edad:");
        int edad = read.nextInt();
        System.out.println("Cargo:");
        String cargo = read.next();
System.out.println(c.verificarExisteCapacidad());
        if (!c.verificarExisteCapacidad()) {
            throw new Exception("Excepción por maximo de socios.");
        }

        if (c.verificarExisteSocio(nombre, edad, cargo)) {
            throw new Exception("Excepción por ingresar un socio que ya está afiliado al club.");
        }

        c.agregarSocio(nombre, edad, cargo);
        System.out.println("Socio afiliado correctamente!");
    }

    public static void main(String[] args) throws Exception {
        c.preCarga();
        while (menu());

    }
}