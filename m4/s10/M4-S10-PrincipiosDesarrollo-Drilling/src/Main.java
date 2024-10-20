import datos.Coleccion;
import modelo.DirectorTecnico;
import modelo.Jugador;

public class Main {
    public static void main(String[] args) {
        DirectorTecnico dt = new DirectorTecnico("Reinaldo", "Rueda", 63, 2);
//        System.out.println(dt);

//        dt.agregarTarjetaAmarilla(2);
//        dt.agregarTarjetaRoja(1);
//        System.out.println(dt.listarTarjetas());

        Jugador j1 = new Jugador("Claudio", "Bravo", 37, 1, "Arquero");
        Jugador j2 = new Jugador("Gary", "Medel", 33, 17, "Central");
        Jugador j3 = new Jugador("Alexis", "Sanchez", 31, 7, "Delantero");
        Coleccion c = new Coleccion();
        c.agregar(dt);
        c.agregar(j1);
        c.agregar(j2);
        c.agregar(j3);

        c.listar();
    }
}