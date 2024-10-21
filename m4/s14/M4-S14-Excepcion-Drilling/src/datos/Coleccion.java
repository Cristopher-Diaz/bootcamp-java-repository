package datos;

import modelo.Socio;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    List<Socio> listaSocios = new ArrayList<>();

    public String mostrarSocios(){
        String out = "";
        for (Socio temp : listaSocios) {
            out += (temp+"\n");
        }
        return out;
    }

    public void preCarga() {
        listaSocios.add(new Socio("Milton", 20, "tesorero"));
        listaSocios.add(new Socio("Tom", 25, "presidente"));
        listaSocios.add(new Socio("Maria", 23, "videpresidenta"));
        listaSocios.add(new Socio("Laura", 24, "secretaria"));
        listaSocios.add(new Socio("Nelson", 21, "representante"));
    }

    public boolean verificarExisteSocio(String nombre, int edad , String cargo) throws Exception {
        boolean existe = false;
        Socio socio = new Socio(nombre, edad , cargo);
        System.out.println("Datos del socio: " + socio);
        for (Socio temp : listaSocios) {
            if(temp.getNombre().equals(socio.getNombre()) && temp.getEdad() == socio.getEdad() && temp.getCargo().equals(socio.getCargo())) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean verificarExisteCapacidad () {
        boolean capacidad = true;
        if (listaSocios.size() >= 7) {
            capacidad = false;
        }
        return capacidad;
    }

    public void agregarSocio (String nombre, int edad , String cargo) {
        Socio socio = new Socio(nombre, edad , cargo);
        listaSocios.add(socio);
    }

    public int cantidadActualDeSocios () {
        return listaSocios.size();
    }
}
