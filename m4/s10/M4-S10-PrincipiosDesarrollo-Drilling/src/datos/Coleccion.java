package datos;


import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    private List<Object> elementos;

    public Coleccion() {
        elementos = new ArrayList<>();
    }

    public void agregar(Object elemento) {
        elementos.add(elemento);
    }

    public void listar() {
        for (Object elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public void eliminar(Object elemento) {
        elementos.remove(elemento);
    }
}
