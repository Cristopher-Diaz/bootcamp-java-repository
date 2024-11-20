package model;
 
public class Departamento {
	private int numero;
	private String nombre;
	private String ubicacion;
	
	public Departamento(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
 
	public int getNumero() {
		return numero;
	}
 
	public void setNumero(int numero) {
		this.numero = numero;
	}
 
	public String getNombre() {
		return nombre;
	}
 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	public String getUbicacion() {
		return ubicacion;
	}
 
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
 
	@Override
	public String toString() {
		return "Departamento [numero=" + numero + ", nombre=" + nombre + ", ubicacion=" + ubicacion + "]";
	}
	
	
}
