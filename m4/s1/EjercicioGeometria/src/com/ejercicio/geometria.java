package com.ejercicio;
 
import java.util.Scanner;
 
public class geometria {
 
	// variable global : es aquella que la ven todas las funciones
	static Scanner read = new Scanner(System.in);
 
	// función del rectangulo
	public static void rectangulo() {
		// variables locales
		int base, altura, area, perimetro;
 
		// Solicitar la base del rectángulo
		System.out.print("Ingrese la base del rectángulo: ");
		base = read.nextInt();
 
		// Solicitar la altura del rectángulo
		System.out.print("Ingrese la altura del rectángulo: ");
		altura = read.nextInt();
 
		// Calcular el área y el perímetro
		area = base * altura;
		perimetro = 2 * (base + altura);
 
		System.out.printf("Rectangulo \nÁrea: %d metros cuadrado\nPerimetro: %d metros", area, perimetro);
 
	}
 
	// función del circulo
	public static void circulo() {
		// variables locales
		double radio, area, perimetro;
 
		System.out.println("Ingrese radio del circulo:");
		radio = read.nextDouble();
 
		// Proceso
		area = Math.PI * Math.pow(radio, 2);
		perimetro = 2 * Math.PI * radio;
 
		// Salida de datos
		System.out.printf("Area: %.2f \nPerimetro: %.2f", area, perimetro);
 
	}
 
	// función del triangulo equilatero
	public static void trianguloEquilatero() {
		// variables locales
		double lado, area, perimetro;
 
		// Entrada de datos:
		System.out.println("Ingrese lado del triangulo:");
		lado = read.nextDouble();
 
		// Proceso
		area = Math.pow(lado, 2) * Math.sqrt(3) / 4;
		perimetro = 3 * lado;
 
		// Salida de datos
		System.out.printf("Area: %.2f \nPerimetro: %.2f", area, perimetro);
	}
 
	// función del Menú
	public static boolean menu() {
 
		boolean continuar = true; //indica que se debe mostrar menú
		System.out.println("\n");
		System.out.println("Bienvenidos/as al sistema de geometria");
		System.out.println("*******Seleccione una opción*******");
		System.out.println("1. Operaciones sobre rectangulo");
		System.out.println("2. Operaciones sobre circulo");
		System.out.println("3. Operaciones sobre triangulo equilatero");
		System.out.println("4. Salir");
		int opcion = read.nextInt();
 
		switch (opcion) {
		case 1:
			rectangulo();
			break;
		case 2:
			circulo();
			break;
		case 3:
			trianguloEquilatero();
			break;
		case 4:
			continuar = false; //indica que se deja de mostrar el menú
			break;
		default:
			System.out.println("Error, ingrese una opción válida");			
			break;
		}
 
		return continuar;
	}
 
	// Ejecución Principal
	public static void main(String[] args) {
		while(menu()); //mientras continuar sea true se ejecuta
		System.out.println("Fin de Programa");
	}
 
}



