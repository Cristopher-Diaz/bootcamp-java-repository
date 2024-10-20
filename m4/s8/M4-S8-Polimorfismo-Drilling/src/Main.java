import Coleccion.Coleccion;

import java.util.Scanner;

public class Main {
    static Coleccion c = new Coleccion();
    static Scanner read = new Scanner(System.in);

    public static boolean menu() {
        boolean bucle = true;

        System.out.println("Que desea hacer?");
        System.out.println("1. Mostrar lista de productos");
        System.out.println("2. Comprar (Agregar al carrito)");
        System.out.println("3. Ver carrito");
        System.out.println("4. Pagar");
        System.out.println("5. Salir");
        int opt = read.nextInt();

        switch(opt) {
            case 1: mostrarProductos();
                    break;
            case 2: agregarAlcarrito();
                    break;
            case 3: mostrarCarrito();
                    break;
            case 4: pagar();
                    break;
            case 5: salir();
                    break;
        }


        return bucle;
    }

    private static void mostrarProductos() {
        System.out.println(c.listarCatalogo());
    }

    private static void agregarAlcarrito() {

    }

    private static void mostrarCarrito() {
    }

    private static void pagar() {
    }

    private static void salir() {
    }

    public static void main(String[] args) {
        c.precargar();
        System.out.println("Ingrese su nombre");
        String nombre = read.next();
        System.out.println("Ingrese su Rut");
        String rut = read.next();

        System.out.println("Bienvenido/a " + nombre);
        while(menu());
    }
}