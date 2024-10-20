package com.imcv2;

import java.util.Scanner;

public class imcV2 {
	
	public static void main(String[] args) {
//      Declaración de variable
      double peso, estatura, imc, edad;
      Scanner read = new Scanner(System.in);
//      Ingreso de datos
      
      System.out.println("Ingrese su edad");
      edad = read.nextDouble();
      
      System.out.println("Ingrese Peso en Kilos");
      peso = read.nextDouble();

      System.out.println("Ingrese Altura en Metros");
      estatura = read.nextDouble();

      imc = peso/(estatura * estatura);
//      Salida de datos
      System.out.println("Su imc es " + String.format("%.2f", imc) );
      
      if (edad < 45) {
    	  if (imc < 22) {
    		  System.out.println("Su imc es BAJO");
    	  } else {
    		  System.out.println("Su imc es MEDIO");
    	  }
      } else {
    	  if (imc >= 22) {
    		  System.out.println("Su imc es ALTO");
    	  } else {
    		  System.out.println("Su imc es MEDIO");
    	  }
      }
      
      if (imc >= 22 && edad >= 45) {
    	  System.out.println("Su imc tiene un riesgo ALTO");
      }
      
      if ((imc >= 22 && edad < 45) || (imc < 22 && edad >= 45)) {
    	  System.out.println("Su imc tiene un riesgo MEDIO");
      }
      
      if (imc < 22 && edad < 45) {
    	  System.out.println("Su imc tiene un riesgo BAJO");
      }

      read.close();

	}

}
