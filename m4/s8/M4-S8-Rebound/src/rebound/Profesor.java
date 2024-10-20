package rebound;

public class Profesor extends Persona{
    private String especialidad;

    public Profesor(String nombre, int identificador, String especialidad) {
        super(nombre, identificador);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", identificador=" + identificador +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
