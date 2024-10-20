import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> valores = new ArrayList<>();

    public static boolean leerValores() {
        Scanner read = new Scanner(System.in);
        boolean bucle = true;
        System.out.println("Ingrese un número entero");
        int input = read.nextInt();
        valores.add(input);
        if(input == -99) {
            bucle = false;
        }
        return bucle;
    }

    public static int calcularSuma(ArrayList<Integer> valores) {
        int total = 0;
        for (Integer temp : valores) {
            total += temp;
        }
        return total;
    }

    public static void mostrarResultados(ArrayList<Integer> valores, int totalSuma, double promedio) {
        System.out.println("La suma de todos los valores es: " + totalSuma);
        System.out.println("La media es: " + promedio);

        int valoresMenoresPromedio = 0;
        int valoresMayoresPromedio = 0;

        for (Integer valor : valores) {
            if (valor < promedio) {
                valoresMenoresPromedio++;
            } else if (valor > promedio) {
                valoresMayoresPromedio++;
            }
        }

        System.out.println("\nNúmeros menores al promedio: " + valoresMenoresPromedio);
        System.out.println("Números mayores al promedio: " + valoresMayoresPromedio);
    }

    public static void main(String[] args) {
        while (leerValores());
        int totalSuma = calcularSuma(valores);
        double promedio = totalSuma / valores.size();
        mostrarResultados(valores, totalSuma, promedio);
    }
}