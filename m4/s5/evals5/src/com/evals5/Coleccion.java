package com.evals5;

import java.util.ArrayList;

public class Coleccion {
	
	//Arreglo dinámico
	ArrayList<Producto> listaProducto = new ArrayList<>();
	
	public void agregar(Producto p) {
		listaProducto.add(p);
	}
	
	public String listar() {
		String salida ="";
		for(Producto temp : listaProducto) {
			salida += temp.toString() + "\n";
		}
		return salida;
	}
	
	
}
