package modelo;

public class Vestuario extends Producto {
	protected String talla;
	protected String color;

	public Vestuario() {
		super();
	}

	public Vestuario(String nombre, String codigo, int precio, String talla, String color) {
		super(nombre, codigo, precio);
		this.talla = talla;
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vestuario [talla=" + talla + ", color=" + color + "" + ", nombre= " + super.nombre + ", codigo="
				+ super.codigo + ", precio=" + super.precio + "]";
	}

}
