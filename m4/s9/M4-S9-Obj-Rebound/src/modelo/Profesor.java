package modelo;

import java.time.LocalDate;

public class Profesor extends Persona{
    public Profesor(String nombre, LocalDate fecha_nacimiento) {
        super(nombre, fecha_nacimiento);
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                '}';
    }
}
