package modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelo.Mercado;
import org.modelo.Producto;

import static org.junit.jupiter.api.Assertions.*;

public class MercadoTest {
//    Se crea una instancia de la clase a probar
    private Mercado mercado;

    @BeforeEach
    public void setUp () {
        mercado = new Mercado();
    }


    @Test
    void publicarAviso () {
//        Definimos un producto
        Producto p = new Producto("nombre", 1, "nuevo", "$400");
//        Se agrega a mercado
        String out = mercado.publicarAviso(p);
//        El producto se ha subido al mercado en linea
        assertNotNull(out, "La salida no debe ser nula");
    }
    @Test
    void verTodoAviso () {
//        Definimos un producto
        Producto p = new Producto("nombre", 1, "nuevo", "$400");
//        Se agrega a mercado
        mercado.publicarAviso(p);
        String out = mercado.verTodoAviso();
//        El producto se ha subido al mercado en linea
        assertNotNull(out, "La salida no debe ser nula");
    }
}
