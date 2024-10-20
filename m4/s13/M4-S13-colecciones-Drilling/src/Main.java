import datos.Auxiliar;

import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);
    static Auxiliar aux = new Auxiliar();

    public static boolean menu () {
        boolean bucle = true;
        System.out.println("Centro de estudios integrales");
        System.out.println("1. Ver la lista de cursos disponible");
        System.out.println("2. Matricular nuevo alumno");
        System.out.println("3. Integrar nuevo curso");
        System.out.println("4. Asignar curso");
        System.out.println("5. Ver lista alumnos por curso");
        System.out.println("6. salir");
        int opt = read.nextInt();

        switch (opt) {
            case 1: verListaCursos();
                break;
            case 2: matricularAlumno();
                break;
            case 3: integrarCurso();
                break;
            case 4: asignarCurso();
                break;
            case 5:
                verListaAlumnos();
                break;
            case 6:
                bucle = false;
                break;
        }

        return bucle;
    }

    private static void verListaCursos() {
        System.out.println(aux.verCursos());
    }

    private static void matricularAlumno() {
    }

    private static void integrarCurso() {
    }

    private static void asignarCurso() {
    }

    private static void verListaAlumnos() {
        System.out.println(aux.verAlumnos());
    }

    public static void main(String[] args) {
        aux.precarga();
        while (menu());
        System.out.println("Programa terminado");
    }
}