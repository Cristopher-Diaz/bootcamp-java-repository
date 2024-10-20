import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Init script");
        Integer base, altura, area, perimetro;

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la base en CM");
        base = read.nextInt();

        System.out.println("Ingrese la altura en CM");
        altura = read.nextInt();

        area = base * altura;
        perimetro = (base * 2) + (altura * 2);
        System.out.println("El area es " + area);
        System.out.println("El perimetro es " + perimetro);

        read.close();
    }
}