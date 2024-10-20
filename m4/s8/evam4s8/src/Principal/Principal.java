package Principal;

import java.util.Scanner;

import Coleccion.Coleccion;

public class Principal {
	static Scanner read = new Scanner(System.in);
	static Coleccion c = new Coleccion();

	private static void pagar() {

	}

	private static void agregarCarrito() {

	}

	private static void listarProducto() {
		System.out.println(c.listarProductos());
	}

	private static boolean menu() {

		boolean continuar = true;

		System.out.println("¿Que desea hacer?");
		System.out.println("1. Mostrar lista de productos");
		System.out.println("2. Comprar (agregar al carrito)");
		System.out.println("3. Ver carrito");
		System.out.println("4. Pagar");
		System.out.println("5. Salir");
		int opcion = read.nextInt();

		switch (opcion) {
		case 1:
			listarProducto();
			break;
		case 2:
			agregarCarrito();
			break;
		case 3:
			agregarCarrito();
			break;
		case 4:
			pagar();
			break;
		case 5:
			continuar = false;
			break;
		}

		return continuar;
	}

	public static void main(String[] args) {
		c.precarga();

		System.out.println("Ingrese su nombre");
		String nombre = read.next();
		System.out.println("Ingrese su rut");
		String rut = read.next();
		System.out.println("Bienvenido/a " + nombre);

		while (menu());
	}

}
