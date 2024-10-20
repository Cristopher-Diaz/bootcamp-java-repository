import com.ejerciciosClase.Auto;
import com.ejerciciosClase.Moto;

public class Main {
    public static void main(String[] args) {
        Auto mi_auto = new Auto("MarcaDelAuto", 150, 5);
        Moto mi_moto = new Moto("MarcaDeMoto", 120, "Azul");

        System.out.println("Detalles del auto");
        mi_auto.mostrarDetalles();
        System.out.println("-------------");
        System.out.println("Detalles de la moto");
        mi_moto.mostrarDetalles();

    }
}