package Coleccion;

import Modelo.Producto;
import Modelo.Vegetales;
import Modelo.Vestuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Coleccion {
    List<Producto> catalogo = new ArrayList<>();
    List<Producto> carrito = new ArrayList<>();

    public void precargar() {
        Vestuario v1 = new Vestuario("polera","p01",2000,"s","rojo");
        Vestuario v2 = new Vestuario("pantalon","p02",5000,"40","negro");
        Vegetales ve1 = new Vegetales("papa","pp1",500, LocalDate.of(2024, 10, 4),LocalDate.of(2024, 10, 10));
        Vegetales ve2 = new Vegetales("lechuga","l1",500,LocalDate.of(2024, 10, 4),LocalDate.of(2024, 10, 11));

        catalogo.add(v1);
        catalogo.add(v2);
        catalogo.add(ve1);
        catalogo.add(ve2);
    }

    public String listarCatalogo() {
        String salida = "";
        for (Producto temp: catalogo) {
            salida += temp.toString() + "\n";
        }
        return salida;
    }

    public void agregarAlCarrito(Producto p) {
        carrito.add(p);
    }

    public String listarCarrito() {
        String salida = "";
        for (Producto temp: carrito) {
            salida += temp.toString() + "\n";
        }
        return salida;
    }

    //Calcula el total a pagar
    public int TotalPagar() {
        int pago=0;
        for(Producto temp : carrito) {
            pago +=pago + temp.getPrecio();
        }
        return pago;
    }


}

