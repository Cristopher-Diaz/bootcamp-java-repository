package modelo;

public class Producto {
	
	// atributo
	protected String nombre;
	protected String codigo;
	protected int precio;
	
	//constructor
	public Producto() {
	}
	
	public Producto(String nombre, String codigo, int precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}

	//getter and setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	//toString
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + "]";
	}
	
    
	
	
}
