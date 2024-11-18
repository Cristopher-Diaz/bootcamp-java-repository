package org.example;

import org.rebound19.EquipoBascket;
import org.rebound19.Jugador;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear jugadores
        Jugador jugador1 = Jugador.crearJugador("Juan", 20, 7);
        Jugador jugador2 = Jugador.crearJugador("Carlos", 22, 10);

        // Agregar jugadores a la lista
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);

        // Crear el equipo de baloncesto
        EquipoBascket equipo = EquipoBascket.crearEquipo("Leones", "Santiago", jugadores);

        // Imprimir información del equipo
        System.out.println("Equipo: " + equipo.getNombreEquipo() + " - Ciudad: " + equipo.getCiudad());
        for (Jugador jugador : equipo.getListaJugadores()) {
            System.out.println("Jugador: " + jugador.getNombre() + ", Edad: " + jugador.getEdad() + ", Número: " + jugador.getNumero());
        }
    }
}