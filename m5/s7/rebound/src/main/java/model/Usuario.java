package model;

public class Usuario {
	private int id;
	private String nombre;
	private String clave;
	private int rut;
	private String dv;
	
	public Usuario(int id, String nombre, String clave, int rut, String dv) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clave = clave;
		this.rut = rut;
		this.dv = dv;
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

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getDv() {
		return dv;
	}

	public void setDv(String dv) {
		this.dv = dv;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", clave=" + clave + ", rut=" + rut + ", dv=" + dv + "]";
	}
	
	
}
