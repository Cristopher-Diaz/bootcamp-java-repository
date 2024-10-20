package com.evals5;
import java.util.Scanner;

public class Principal {
    //variables globales static (Las ven todos los métodos)
	static Scanner read = new Scanner(System.in);
	static Producto p;
	static Coleccion c = new Coleccion();
	
	private static void eliminar() {
		
	}

	private static void modificar() {
		
	}

	private static void agregar() {
	 //variables locales  (solo la conoce el método que la implementa)
	 String nombre, descripcion;
	 int valor;
     System.out.println("Ingrese el nombre del producto");
     nombre = read.next();
     System.out.println("Ingrese el valor del producto");
     valor = read.nextInt();
     
     //consume salto de línea pendiente
     read.nextLine();
     
     System.out.println("Ingrese la descripción del producto");
     descripcion = read.nextLine();
     //Crear producto con los valores ingresados por teclado
     p= new Producto(nombre, valor, descripcion);
     //agregar producto a la lista
     c.agregar(p);
     System.out.println("Producto agregado con éxito");
	}

	private static void ver() {
		System.out.println(c.listar());
	}
	
	private static boolean menu() {
		boolean continuar = true;
		System.out.println("Elija una opción");
		System.out.println("1- Ver productos");
		System.out.println("2- Agregar producto");
		System.out.println("3- Modificar producto");
		System.out.println("4. Eliminar producto");
		System.out.println("5- Salir");
		int opcion = read.nextInt();
		
		switch (opcion) {
		case 1:
			ver();
			break;
		case 2:
			agregar();
			break;
		case 3:
			modificar();
			break;
		case 4:
			eliminar();
			break;
		case 5:
			continuar = false;
			break;
		default:
			System.out.println("Error, ingrese un valor entre 1 y 5");
			break;
		}
		
		return continuar;
	}
	
	public static void main(String[] args) {
		while(menu());
		System.out.println("Usted ha salido del programa.");
	}

	

}
