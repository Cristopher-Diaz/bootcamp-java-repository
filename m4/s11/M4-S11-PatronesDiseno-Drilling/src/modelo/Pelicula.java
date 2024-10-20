package modelo;

// Clase Pelicula
public class Pelicula {
    private String titulo;
    private int anoEstreno;
    private boolean arrendada;

    public Pelicula(String titulo, int anoEstreno, boolean arrendada) {
        this.titulo = titulo;
        this.anoEstreno = anoEstreno;
        this.arrendada = arrendada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoEstreno() {
        return anoEstreno;
    }

    public void setAnoEstreno(int anoEstreno) {
        this.anoEstreno = anoEstreno;
    }

    public boolean isArrendada() {
        return arrendada;
    }

    public void setArrendada(boolean arrendada) {
        this.arrendada = arrendada;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", anoEstreno=" + anoEstreno +
                ", arrendada=" + arrendada +
                '}';
    }
}
