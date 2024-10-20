import utilitario.Auxiliar;

import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);
    static Auxiliar aux = new Auxiliar();

    private static boolean menu(){
        boolean bucle = true;
        System.out.println("Tombola para ganar una bicicleta");
        System.out.println("1. Agregar un nuevo participante");
        System.out.println("2. Ver lista completa de participantes");
        System.out.println("3. Seleccionar al ganador");
        System.out.println("4. Salir");
        int opt = read.nextInt();

        switch (opt) {
            case 1: agregarParticipante();
                break;
            case 2: verListaParticipantes();
                break;
            case 3: seleccionarGanador();
                bucle = false;
                break;
            case 4: bucle = false;
                break;
        }
        return bucle;
    }

    private static void seleccionarGanador() {
        String ganador = aux.seleccionarGanador();
        System.out.println("El ganador es: " + ganador);
    }

    private static void verListaParticipantes() {
        aux.leerFichero();
        System.out.println(aux.imprimir());
    }

    private static void agregarParticipante() {
        System.out.println("\nIngrese nompre y apellido del participante");
        read.nextLine();
        String nombreParticipante = read.nextLine();
        aux.agregarParticipante(nombreParticipante);
    }

    public static void main(String[] args) {
        while (menu());
        System.out.println("Saliendo...");
    }
}