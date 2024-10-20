import com.ejemplosClase.Perro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Perro perro = new Perro("perrito", "raza perro", "cafe");
        System.out.println(perro);
        perro.imprimirComer();
    }
}