package model;

public class Departamento {
	private int numero;
	private String nombre;
	private Ubicacion ubicacion;
	
	public Departamento(int numero, String nombre, Ubicacion ubicacion) {
		this.numero = numero;
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

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Departamento [numero=" + numero + ", nombre=" + nombre + ", ubicacion=" + ubicacion + "]";
	}
	
	
	
}
