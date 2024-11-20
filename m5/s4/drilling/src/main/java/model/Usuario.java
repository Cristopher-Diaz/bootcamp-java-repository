package model;
 
public class Usuario {
	private int rut;
	private String clave;
	private String nombre;
	
	public Usuario(int rut, String clave, String nombre) {
		this.rut = rut;
		this.clave = clave;
		this.nombre = nombre;
	}
 
	public int getRut() {
		return rut;
	}
 
	public void setRut(int rut) {
		this.rut = rut;
	}
 
	public String getClave() {
		return clave;
	}
 
	public void setClave(String clave) {
		this.clave = clave;
	}
 
	public String getNombre() {
		return nombre;
	}
 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	@Override
	public String toString() {
		return "Usuario [rut=" + rut + ", clave=" + clave + ", nombre=" + nombre + "]";
	}
	
}
