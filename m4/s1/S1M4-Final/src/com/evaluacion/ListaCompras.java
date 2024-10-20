package com.evaluacion;

public class ListaCompras {

	public static void main(String[] args) {
		double cocina = 299990, lavadora = 234540, comedor = 159990, televisor = 345100, valorDolar = 934, totalCompra;
		
		totalCompra = cocina + lavadora + comedor + televisor;
 
        double iva = totalCompra * 0.19;
 
        double totalConIva = totalCompra + iva;
 
        double totalEnDolares = totalConIva / valorDolar;
 
        System.out.printf("Total sin IVA: $%.0f%n", totalCompra);
        System.out.printf("IVA (19%%): $%.1f%n", iva);
        System.out.printf("Total con IVA: $%.0f%n", totalConIva);
        System.out.printf("Total en dólares: $%.2f%n", totalEnDolares);
	
	}

}
