package modelo;

public class Pelicula {

	private String titulo;
	private int añoEstreno;
	private boolean arrendada; //true: no disponible   false: disponible
	
	public Pelicula(String titulo, int añoEstreno, boolean arrendada) {
		super();
		this.titulo = titulo;
		this.añoEstreno = añoEstreno;
		this.arrendada = arrendada;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAñoEstreno() {
		return añoEstreno;
	}

	public void setAñoEstreno(int añoEstreno) {
		this.añoEstreno = añoEstreno;
	}

	public boolean isArrendada() {
		return arrendada;
	}

	public void setArrendada(boolean arrendada) {
		this.arrendada = arrendada;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", añoEstreno=" + añoEstreno + ", arrendada=" + arrendada + "]";
	}
	
	
	
}
