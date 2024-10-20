import modelo.Dueño;
import java.util.Scanner;

import datos.Coleccion;
import modelo.Pelicula;

public class Main {
    static Dueño d = Dueño.getInstance();
    static Scanner read = new Scanner(System.in);
    static Coleccion c = new Coleccion();

    private static void listarPeliculas() {
        System.out.println(c.listar());
    }
    public static void listarPeliculasDisponibles() {
        System.out.println(c.listarPeliculasDisponibles());

    }
    private static void arrendarPelicula() {
        System.out.println("Ingrese nombre de la pelicula que desea arrendar");
        read.nextLine();
        String nombre = read.nextLine();
        System.out.println("Seleccione método de pago");
        System.out.println("1. Debito");
        System.out.println("2. Efectivo");
        int formaPago = read.nextInt();
        System.out.println(c.arrendar(nombre, formaPago));
    }
    private static void devolverPelicula() {
        System.out.println("Ingrese nombre de la pelicula que desea devolver");
        read.nextLine();
        String nombre = read.nextLine();
        System.out.println(c.devolver(nombre));
    }

    private static boolean menu() {
        boolean continuar = true;
        System.out.println("Bienvenidos al video club nostalgia " + d.getNombre());
        System.out.println("Selecciona la opción que desees:");
        System.out.println("1. Ver lista de peliculas");
        System.out.println("2. Ver lista de peliculas disponibles");
        System.out.println("3. Arrendar una pelicula");
        System.out.println("4. Devolver una pelicula");
        System.out.println("5. Cerrar Programa");

        int opcion = read.nextInt();

        switch(opcion) {

            case 1: listarPeliculas();
                break;
            case 2: listarPeliculasDisponibles();
                break;
            case 3: arrendarPelicula();
                break;
            case 4: devolverPelicula();
                break;
            case 5: continuar = false;
                break;
        }

        return continuar;
    }

    public static void main(String[] args) {
        c.precarga();
        while(menu());
        System.out.println("Usted ha cerrado el programa");
    }

}


