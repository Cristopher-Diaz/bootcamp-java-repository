package org.rebound19;

import java.util.List;

public class EquipoBascket {

    private String nombreEquipo;
    private String ciudad;
    private List<Jugador> listaJugadores;

    public EquipoBascket(String nombreEquipo, String ciudad, List<Jugador> listaJugadores) {
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        this.listaJugadores = listaJugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    //Método personalizado
//    public EquipoBascket crearEquipo(String nombre, String ciudad, List<Jugador> listaJugadores) {
//        EquipoBascket equipo = new EquipoBascket();
//        equipo.setNombreEquipo(nombre);
//        equipo.setCiudad(ciudad);
//        equipo.setListaJugadores(listaJugadores);
//
//        return equipo;
//
//    }

    public static EquipoBascket crearEquipo(String nombreEquipo, String ciudad, List<Jugador> listaJugadores) {
        return new EquipoBascket(nombreEquipo, ciudad, listaJugadores);
    }

}
