package datos;

import java.util.ArrayList;

import interfaces.PagoServicio;
import modelo.MetodoPagoFactory;
import modelo.Pelicula;

public class Coleccion {

	ArrayList<Pelicula> peliculas = new ArrayList<>();
	
	public void precarga() {
		
		peliculas.add(new Pelicula("Batman inicia", 2005, false));
		peliculas.add(new Pelicula("Mi vecino Totoro", 1988, false));
		peliculas.add(new Pelicula("Bastardos sin gloria", 2009, true));
		peliculas.add(new Pelicula("Django sin cadenas", 2012, false));
		peliculas.add(new Pelicula("Psicosis", 1960, false));
		peliculas.add(new Pelicula("Los siete pecados capitales", 1995, true));
		peliculas.add(new Pelicula("El origen", 2010, false));
		peliculas.add(new Pelicula("Forrest Gump", 1994, true));
		peliculas.add(new Pelicula("La Lista de Schindler", 1993, false));
		peliculas.add(new Pelicula("El Padrino", 1972, true));
		
	}
	
	public String listar() {
		String salida="";
		for(Pelicula temp : peliculas) {
			salida = salida + temp.toString() + "\n";
		}
		return salida;
	}
	
	public String listarDisponibles() {
		String salida="";
		for(Pelicula temp : peliculas) {
			if(!temp.isArrendada())  // temp.isArrendada() == false
			salida = salida + temp.toString() + "\n";
		}
		return salida;
	}
	
	public String arrendar(String nombre, int formaPago) {
		String salida="";
		
		//buscar la pelicula y arrendarla
		for(Pelicula temp : peliculas) {
			if(temp.getTitulo().equals(nombre)) {
				temp.setArrendada(true); //cambia estado a arrendada = true
				salida = salida + "Titulo: " + temp.getTitulo() + " ha sido arrendada exitosamente\n ";
			}
			
		}
		
		//ejecutar el factory
		PagoServicio p = MetodoPagoFactory.getFormaPago(formaPago);
		
		salida = salida + p.realizarPago() + "\n";
		
		return salida;
	}
	
	public String devolver(String nombre) {
        String salida="";
		
		//buscar la pelicula y arrendarla
		for(Pelicula temp : peliculas) {
			if(temp.getTitulo().equals(nombre)) {
				temp.setArrendada(false); //cambia estado a arrendada = false
				salida = salida + "Titulo: " + temp.getTitulo() + " ha sido devuelta exitosamente\n ";
			}
			
		}
		
		return salida;
	}
}
