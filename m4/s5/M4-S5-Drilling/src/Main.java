import tienda.Coleccion;
import tienda.Producto;

import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);
    static Coleccion coleccion = new Coleccion();

    private static boolean menu() {
        boolean bucle = true;
        System.out.println("Seleccione que desea hacer");
        System.out.println("1. Ver productos");
        System.out.println("2. Agregar producto");
        System.out.println("3. Modificar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Salir");
        int option;

        option = read.nextInt();
        switch(option) {
            case 1:
                verProductos();
                break;
            case 2:
                agregarProducto();
                break;
            case 3:
                modificarProducto();
                break;
            case 4:
                eliminarProducto();
                break;
            case 5:
                System.out.println("Saliendo...");
                bucle = false;
                break;
            default:
                System.out.println("Error, debe ingresar una opción entre 1 y 4");
                break;
        }
        return bucle;
    }
    private static void precarga() {
        //variables locales
        Producto p1 = new Producto("Chocolate", 500, "Chocolate amargo, 500 gr.");
        Producto p2 = new Producto("Leche", 800, "Leche entera, 1 litro.");
        Producto p3 = new Producto("Arroz", 900, "Arroz grado 2, 1 kg.");

        //guardar productos por defecto
        coleccion.agregarProducto(p1);
        coleccion.agregarProducto(p2);
        coleccion.agregarProducto(p3);

    }

    private static void verProductos() {
        System.out.println(coleccion.verProductos());
    }

    private static void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = read.next();

        System.out.print("Ingrese el valor del producto: ");
        int valor = read.nextInt();
        read.nextLine();

        System.out.print("Ingrese la descripción del producto: ");
        String descripcion = read.nextLine();

        Producto nuevoProducto = new Producto(nombre, valor, descripcion);
        coleccion.agregarProducto(nuevoProducto);
    }

    private static void modificarProducto() {
    }

    private static void eliminarProducto() {
    }

    public static void main(String[] args) {
        precarga();
        while(menu());
        System.out.println("Programa finalizado");
    }
}