package modelo;

public class Jugador extends Persona{
    private int numero;
    private String posicion;

    public Jugador(String nombre, String apellido, int edad, int numero, String posicion) {
        super(nombre, apellido, edad);
        this.numero = numero;
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", numero=" + numero +
                ", posicion='" + posicion + '\'' +
                '}';
    }
    public void correr() {
        System.out.println("El jugador" + getNombre() + " está corriendo.");
    }

    public void saltar() {
        System.out.println("El jugador" + getNombre() + " está saltando.");
    }

    public void quitarBalon() {
        System.out.println("El jugador" + getNombre() + " ha quitado el balón.");
    }

    public String listarTarjetas() {
        return "El Jugador tiene " + super.cantTarjetasRojas + " tarjeta(s) roja(s) "
                + " y "+ super.cantTarjetasAmarillas + " tarjeta(s) amarilla(s)";
    }


    public void celebrar() {
        System.out.println(getNombre() + " está celebrando.");
    }
}
