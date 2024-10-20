package Modelo;

import java.time.LocalDate;

public class Vegetales extends Producto{
    private LocalDate fecha_envasado;
    private LocalDate fecha_caducidad;

    public Vegetales(String nombre, String codigo, int precio, LocalDate fecha_envasado, LocalDate fecha_caducidad) {
        super(nombre, codigo, precio);
        this.fecha_envasado = fecha_envasado;
        this.fecha_caducidad = fecha_caducidad;
    }

    public LocalDate getFecha_envasado() {
        return fecha_envasado;
    }

    public void setFecha_envasado(LocalDate fecha_envasado) {
        this.fecha_envasado = fecha_envasado;
    }

    public LocalDate getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(LocalDate fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    @Override
    public String toString() {
        return "Vegetales{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", fecha_envasado=" + fecha_envasado +
                ", fecha_caducidad=" + fecha_caducidad +
                '}';
    }
}
