import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello world!");
//        Declaración de variable
        double peso, estatura, imc;
        Scanner read = new Scanner(System.in);
//        Ingreso de datos
        System.out.println("Ingrese Peso en Kilos");
        peso = read.nextDouble();

        System.out.println("Ingrese Altura en Metros");
        estatura = read.nextDouble();

        imc = peso/(estatura * estatura);
//        Salida de datos
        System.out.println("Su imc es  " + String.format("%.2f", imc) );

        read.close();
    }
}





