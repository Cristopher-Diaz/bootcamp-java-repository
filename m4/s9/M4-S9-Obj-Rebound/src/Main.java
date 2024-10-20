import modelo.Alumno;
import modelo.Persona;
import modelo.Profesor;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    static ArrayList<Persona> personasArray = new ArrayList<>();
    public static void main(String[] args) {
        Profesor p = new Profesor("nombre profesor", LocalDate.of(1988, 7, 1));

        Alumno a1 = new Alumno("Alumno_1", LocalDate.of(1993, 6, 4), true);
        Alumno a2 = new Alumno("Alumno_2", LocalDate.of(1997, 1, 5), false);
        Alumno a3 = new Alumno("Alumno_3", LocalDate.of(1999, 10, 8), false);
        Alumno a4 = new Alumno("Alumno_4", LocalDate.of(2000, 7, 23), true);
        personasArray.add(p);
        personasArray.add(a1);
        personasArray.add(a2);
        personasArray.add(a3);
        personasArray.add(a4);

        System.out.println("-----Punto 3-----");
        for (Persona temp : personasArray) {
            System.out.println(temp.getClass().getSimpleName() +" - "+ temp.getNombre());
        }

        System.out.println("-----Punto 4-----");
        for (Persona temp : personasArray) {
            System.out.println(temp.getClass().getSuperclass().getSimpleName() +" - "+ temp.getNombre());
        }
        System.out.println("-----Punto 5-----");
        for (Persona temp : personasArray) {
            System.out.println(temp);
        }
    }
}