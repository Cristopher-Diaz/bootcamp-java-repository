package modelo;

public class Dueño {
    private static Dueño d;
    private String nombre = "Cristopher";
    private Dueño() {}

    public static Dueño getInstance() {
        if(d == null){
            d = new Dueño();
        }
        return d;
    }

    public static Dueño getD() {
        return d;
    }

    public static void setD(Dueño d) {
        Dueño.d = d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Dueño{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
