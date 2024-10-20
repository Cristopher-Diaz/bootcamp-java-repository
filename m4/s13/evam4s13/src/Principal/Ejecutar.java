package Principal;

import java.util.Scanner;

import datos.Auxiliar;

public class Ejecutar {
	static Scanner read = new Scanner(System.in);
	static Auxiliar aux = new Auxiliar();

	private static void verListaAlumnos() {

	}

	private static void asignarCurso() {

	}

	private static void ingresarCurso() {

	}

	private static void matricular() {

	}

	private static void verListaCursos() {
		System.out.println(aux.verCursos());

	}

	private static boolean menu() {
		boolean continuar = true;
		System.out.println("Centro de Estudios Integrales");
		System.out.println("1-Ver la lista de cursos disponibles");
		System.out.println("2-Matricular nuevo Alumno");
		System.out.println("3-Ingresar nuevo Curso");
		System.out.println("4-Asignar curso");
		System.out.println("5-Ver Lista Alumnos por curso");
		System.out.println("6-Salir");
		int opcion = read.nextInt();

		switch (opcion) {
		case 1:
			verListaCursos();
			break;
		case 2:
			matricular();
			break;
		case 3:
			ingresarCurso();
			break;
		case 4:
			asignarCurso();
			break;
		case 5:
			verListaAlumnos();
			break;
		case 6:
			continuar = false;
			break;
		}

		return continuar;
	}

	public static void main(String[] args) {
		aux.precarga();
		while (menu())
			;
		System.out.println("Programa Terminado");

	}

}
