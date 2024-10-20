
import java.util.Scanner;
 
public class geometria {
	
	//variable global : es aquella que la ven todas las funciones
	static Scanner read = new Scanner(System.in);
	
	//función del rectangulo
	public static void rectangulo() {
		//variables locales
		int base, altura, area , perimetro;
		
		//Solicitar la base del rectángulo
        System.out.print("Ingrese la base del rectángulo: ");
        base = read.nextInt();
 
        // Solicitar la altura del rectángulo
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = read.nextInt();
 
        // Calcular el área y el perímetro
        area = base * altura;
        perimetro = 2 * (base + altura);
        
        System.out.printf("Rectangulo \nÁrea: %d metros cuadrado\nPerimetro: %d metros" , area, perimetro);
        
	}
	
	//función del circulo
	public static void circulo() {}
	
	//función del triangulo equilatero
	public static void trianguloEquilatero() {}
		
	//función del Menú
	public static void menu() {}
	
	//Ejecución Principal
	public static void main(String[] args) {
		
		//definición de variables
		int base, altura, area , perimetro;
		double radio, areaCirculo, perimetroCirculo;
	
		Scanner read = new Scanner(System.in);
		
        /* Solicitar la base del rectángulo
        System.out.print("Ingrese la base del rectángulo: ");
        base = read.nextInt();
 
        // Solicitar la altura del rectángulo
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = read.nextInt();
 
        // Calcular el área y el perímetro
        area = base * altura;
        perimetro = 2 * (base + altura);
 
        // Mostrar los resultados en el formato deseado
        /*System.out.println("El área del rectángulo es: " + area + " metros");
        System.out.println("El perímetro del rectángulo es: " + perimetro + " metros");
        
        System.out.printf("Rectangulo \nÁrea: %d metros cuadrado\nPerimetro: %d metros" , area, perimetro);
        */
		/*
        System.out.println("Ingrese radio del circulo:");
		radio = read.nextDouble();
		
		//Proceso
		areaCirculo = Math.PI * Math.pow(radio,2);
		perimetroCirculo = 2 * Math.PI * radio;
		
		//Salida de datos
		System.out.printf("Area: %.2f \nPerimetro: %.2f", areaCirculo, perimetroCirculo);
        */
        
		//formateo de código: CTRL + SHIFT + F
		
		/*double lado_triangulo, area_triangulo, perimetro_triangulo;
 
		// Entrada de datos:
		System.out.println("Ingrese lado del triangulo:");
		lado_triangulo = read.nextDouble();
 
		// Proceso
		area_triangulo = Math.pow(lado_triangulo, 2) * Math.sqrt(3) / 4;
		perimetro_triangulo = 3 * lado_triangulo;
 
		// Salida de datos
		System.out.printf("Area: %.2f \nPerimetro: %.2f", area_triangulo, perimetro_triangulo);
 
		*/
		
	    /*
	     *  
	     *  menu(){
	     *  boolean continuar = true;
	     *  
	     *  Bienvenido a nuestro sistema de Geometria
	     *  Calculo de Áreas y Perimetros
	     *  
	     *  1. Rectangulo
	     *  2. Circulo
	     *  3. Triangulo Equilatero
	     *  4. Salir
	     *  
	     *  opcion = leer
	     *  
	     *  switch
	     *  
	     *   case 1: rectangulo()
	     *   case 2: circulo()
	     *   case 3: trianguloEquilatero()
	     *   case 4: continuar = false
	     *
	     *   return continuar;
	     *   
	     * }
	     *
	     * rectangulo(){
	     *
	     * }
	     *
	     * circulo(){
	     *
	     * }
	     *
	     * trianguloEquilatero(){
	     *
	     * }
	     *
	     */
 
	}
 
}