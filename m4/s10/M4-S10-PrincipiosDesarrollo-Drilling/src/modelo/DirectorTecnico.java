package modelo;

public class DirectorTecnico extends Persona{
    private int anios_jugando;

    public DirectorTecnico(String nombre, String apellido, int edad, int anios_jugando) {
        super(nombre, apellido, edad);
        this.anios_jugando = anios_jugando;
    }

    public int getAnios_jugando() {
        return anios_jugando;
    }

    public void setAnios_jugando(int anios_jugando) {
        this.anios_jugando = anios_jugando;
    }

    @Override
    public String toString() {
        return "DirectorTecnico{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", anios_jugando=" + anios_jugando +
                '}';
    }
    public void celebrar() {
        System.out.println("El director tecnico" + getNombre() + " está celebrando.");
    }
    public void hablar() {
        System.out.println("El director tecnico" + getNombre() + " está hablando.");
    }

    public String listarTarjetas() {
        return "El Director Técnico tiene " + super.cantTarjetasRojas + " tarjeta(s) roja(s) "
                + " y "+ super.cantTarjetasAmarillas + " tarjeta(s) amarilla(s)";
    }
}
