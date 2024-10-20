package modelo;

import java.time.LocalDate;

public class Alumno extends Persona{
    private boolean tareas_pendientes;

    public Alumno(String nombre, LocalDate fecha_nacimiento, boolean tareas_pendientes) {
        super(nombre, fecha_nacimiento);
        this.tareas_pendientes = tareas_pendientes;
    }

    public boolean isTareas_pendientes() {
        return tareas_pendientes;
    }

    public void setTareas_pendientes(boolean tareas_pendientes) {
        this.tareas_pendientes = tareas_pendientes;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", tareas_pendientes=" + tareas_pendientes +
                '}';
    }
}
