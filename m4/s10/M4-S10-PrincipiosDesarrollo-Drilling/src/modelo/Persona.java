package modelo;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int cantTarjetasRojas;
    protected int cantTarjetasAmarillas;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        cantTarjetasRojas = 0;
        cantTarjetasAmarillas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void agregarTarjetaRoja(int cantidad) {
        cantTarjetasRojas =+ cantidad;
    }

    public void agregarTarjetaAmarilla(int cantidad) {
        cantTarjetasAmarillas =+ cantidad;
    }
}
