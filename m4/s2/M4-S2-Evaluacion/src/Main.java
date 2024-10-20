
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Bienvenido");

        System.out.print("Por favor, ingrese la temperatura de hoy en grados Celsius: ");
        double temperatura = scanner.nextDouble();

        String tipoClima;
        if (temperatura <= 10) {
            tipoClima = "frío";
        } else if (temperatura > 10 && temperatura < 20) {
            tipoClima = "nublado";
        } else if (temperatura >= 20 && temperatura < 30) {
            tipoClima = "caluroso";
        } else {
            tipoClima = "tropical";
        }

        System.out.println("Hay " + temperatura + " grados, el tipo de clima hoy es " + tipoClima + ".");

        scanner.close();
    }
}


