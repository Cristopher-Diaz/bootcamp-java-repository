package com.edutecno;

public class Producto {
	private int id;
	private String nombre;
	private int precio;
 
	public Producto(int id, String nombre, int precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
 
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	public String getNombre() {
		return nombre;
	}
 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	public int getPrecio() {
		return precio;
	}
 
	public void setPrecio(int precio) {
		this.precio = precio;
	}
 
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
 
 
}
