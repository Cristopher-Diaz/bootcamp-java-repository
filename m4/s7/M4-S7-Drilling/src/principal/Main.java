package principal;

import modelo.Cocina;
import modelo.Refrigerador;

import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);
    static Cocina cocina;
    static Refrigerador refirgerador;
    static boolean bucle;
    static String opcionSeleccionada;

    public static void main(String[] args) {
        preCarga();
        while (menu());
    }

    public static boolean menu() {
        bucle = true;
        System.out.println("Seleccione que desea hacer");
        System.out.println("1. Cocina");
        System.out.println("2. Refrigerador");
        int option;

        option = read.nextInt();
        switch(option) {
            case 1:
                opcionSeleccionada = "cocina";
                menuComprarCocina();
                break;
            case 2:
                opcionSeleccionada = "refrigerador";
                menuComprarRefrfigerador();
                break;
            default:
                System.out.println("Error, debe ingresar una opción entre 1 y 2");
                break;
        }
        return bucle;
    }
    private static void preCarga() {
        cocina = new Cocina(340.990, 2, 5);
        refirgerador = new Refrigerador(650.990, 4, 'B', 2);
    }

    private static void menuComprarCocina() {
        cocina.mostrarDetalles();
        preConfirmarCompra();
    }
    private static void menuComprarRefrfigerador() {
        refirgerador.mostrarDetalles();
        preConfirmarCompra();
    }
    private static void preConfirmarCompra() {
        System.out.println("");
        System.out.println("Presione Y para continuar. N para cancelar");
        String confirm = read.next();

        if (confirm.equalsIgnoreCase("y")) {
            confirmarCompra();
        } else if (confirm.equalsIgnoreCase("n")) {
            cancelarCompra();
        }
    }

    private static void confirmarCompra() {
        if (opcionSeleccionada.equals("cocina")) {
            System.out.println("Desea Incluir un gas por 5000 pesos? Si o NO");
            String agregaGas = read.next();
            if (agregaGas.equalsIgnoreCase("si")) {
                cocina.incluyeGas(true);
            } else if (agregaGas.equalsIgnoreCase("no")) {
                cocina.incluyeGas(false);
            }
        }
        realizarCompra();
    }

    private static void realizarCompra() {

    }
    private static void cancelarCompra() {
        System.out.println("compra cancelada");
        bucle = false;
    }
}