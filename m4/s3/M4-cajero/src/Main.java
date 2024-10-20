import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);
    static int saldo = 1000;
    public static void girarDinero() {
        int giro;
        System.out.println("Su saldo inicial es " + saldo);
        System.out.println("Digite la cantidad que desea girar");
        giro = read.nextInt();
        if (giro <= saldo) {
            //actualiza el saldo
            saldo = saldo - giro;
            System.out.println("Su nuevo saldo es " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Gracias por operar con nosotros");
    }
    public static void depositarDinero() {
        int deposito;
        System.out.println("Su saldo inicial es " + saldo);
        System.out.println("Digite la cantidad que desea depositar");
        deposito = read.nextInt();
        //actualiza el saldo
        saldo = saldo + deposito;
        System.out.println("Su nuevo saldo es " + saldo);
        System.out.println("Gracias por operar con nosotros");
    }
    public static boolean menu() {
        boolean continuar = true;
        System.out.println("Seleccione una opción");
        System.out.println("1. Depositar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Salir");
        int option;

        option = read.nextInt();
        switch(option) {
            case 1:
                System.out.println("Opcion 1");
                depositarDinero();
                break;
            case 2:
                System.out.println("Opcion 2");
                girarDinero();
                break;
            case 3:
                System.out.println("Saliendo...");
                continuar = false;
                break;
            default:
                System.out.println("Error, debe ingresar una opción entre 1 y 3");
        }
        return continuar;
    }

    public static void main(String[] args) {
        while (menu()) ;
        System.out.println("Programa Finalizado");
    }
}

