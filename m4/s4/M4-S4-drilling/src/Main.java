import vehiculo.Vehiculo;

import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);
    static Vehiculo vehiculo;
    public static void setDatosVehiculo () {
        System.out.println("Ingrese marca del auto");
        String marca = read.next();
        System.out.println("Ingrese modelo del auto");
        String modelo = read.next();
        System.out.println("Ingrese velocidad maxima del auto");
        int velocidadMaxima = read.nextInt();

        vehiculo = new Vehiculo(marca, modelo, velocidadMaxima, false);
        System.out.println(vehiculo);


//        vehiculo = new Vehiculo("marcaAuto", "modeloAuto", 140, false);
//        System.out.println(vehiculo);

    }
    public static void encenderAuto() {
        if (vehiculo.isEncendido()) {
            System.out.println("El vehiculo ya esta encendido");
            return;
        }
        vehiculo.setEncendido(true);
        System.out.println("Se ha encendido el vehiculo");
    }

    public static void apagarAuto() {
        if (!vehiculo.isEncendido()) {
            System.out.println("El vehiculo ya esta apagado");
            return;
        }
        vehiculo.setEncendido(false);
        System.out.println("Se ha apagado el vehiculo");
    }

    public static void acelerarAuto() {
        if (!vehiculo.isEncendido()) {
            System.out.println("El vehiculo esta apagado, no se puede acelerar");
            return;
        }
        System.out.println("Acelerando ....");
    }

    public static boolean menu() {
        boolean bucle = true;
        System.out.println("Seleccione que desea hacer");
        System.out.println("1. Encender auto");
        System.out.println("2. Apagar auto");
        System.out.println("3. Acelerar auto");
        System.out.println("4. Salir");
        int option;

        option = read.nextInt();
        switch(option) {
            case 1:
                encenderAuto();
                break;
            case 2:
                apagarAuto();
                break;
            case 3:
                acelerarAuto();
                break;
            case 4:
                System.out.println("Saliendo...");
                bucle = false;
                break;
            default:
                System.out.println("Error, debe ingresar una opción entre 1 y 4");
                break;
        }
        return bucle;
    }

    public static void main(String[] args) {
        setDatosVehiculo();
        while (menu()) ;
        System.out.println("Programa Finalizado");
    }
}