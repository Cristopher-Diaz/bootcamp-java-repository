package rebound;

public class Persona {
    protected String nombre;
    protected int identificador;

    public Persona(String nombre, int identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public void leerEjercicios() {
        System.out.println(nombre + "esta leyendo...");
    }
    public void realizarEjercicios() {
        System.out.println(nombre + "esta realizando ejercicios...");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", identificador=" + identificador +
                '}';
    }
}
