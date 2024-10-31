package com.ejemplo;

import java.util.ArrayList;
import java.util.List;


public class GestorNombres {
	private List<String> nombres;
	
	public GestorNombres() {
		nombres = new ArrayList<>();
	}
	
	public void agregarNombre(String nombre) {
		if(!nombre.isEmpty())
			nombres.add(nombre);
	}
	
	public void eliminarNombre(String nombre) {
			nombres.remove(nombre);
	}
	
	public boolean existeNombre(String nombre) {
		return nombres.contains(nombre);
	}
	
	public int cantidadNombres() {
		return nombres.size();
	}
}
