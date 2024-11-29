package model;

public class Ubicacion {
	private int id;
	private String nombre;

	public Ubicacion(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public Ubicacion(String nombre) {
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Ubicacion [id=" + id + ", nombre=" + nombre + "]";
	}

}
