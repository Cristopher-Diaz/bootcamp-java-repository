import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        String[] asignaturas = new String[5];
        double[] promedios = new double[5];
//        Inicio ingreso de datos
//        1
        System.out.println("Ingrese el nombre de la asignatura");
        asignaturas[0] = read.next();
        System.out.println("Ingrese el promedio de la signatura");
        promedios[0] = read.nextDouble();
//        2
        System.out.println("Ingrese el nombre de la asignatura");
        asignaturas[1] = read.next();
        System.out.println("Ingrese el promedio de la signatura");
        promedios[1] = read.nextDouble();
//        3
        System.out.println("Ingrese el nombre de la asignatura");
        asignaturas[2] = read.next();
        System.out.println("Ingrese el promedio de la signatura");
        promedios[2] = read.nextDouble();
//        4
        System.out.println("Ingrese el nombre de la asignatura");
        asignaturas[3] = read.next();
        System.out.println("Ingrese el promedio de la signatura");
        promedios[3] = read.nextDouble();
//        5
        System.out.println("Ingrese el nombre de la asignatura");
        asignaturas[4] = read.next();
        System.out.println("Ingrese el promedio de la signatura");
        promedios[4] = read.nextDouble();

        System.out.println(Arrays.toString(promedios));
        double promedioGeneral = calcularPromedioGeneral(promedios);
        System.out.println(promedioGeneral);
    }

    private static double calcularPromedioGeneral(double[] promedios) {
        double total = 0;
        for (int i = 0; i < promedios.length; i++) {
            total += promedios[i];
        }
        return total / promedios.length;
    }
}