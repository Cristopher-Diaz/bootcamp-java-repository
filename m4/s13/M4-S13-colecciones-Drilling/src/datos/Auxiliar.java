package datos;

import modelo.Alumno;
import modelo.Curso;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class Auxiliar {
    static List<Curso> listaCurso = new ArrayList<>();
    static List<Alumno> listAlumnos = new ArrayList<>();

    public String verCursos(){
        String out = "";
        for (Curso temp : listaCurso) {
            out += (temp+"\n");
        }
        return out;
    }

    public String verAlumnos(){
        String out = "";
        for (Alumno temp : listAlumnos) {
            out += (temp+"\n");
        }
        return out;
    }

    public void precarga() {
        listaCurso.add(new Curso("ING1","Inglés", "Curso completo desde nivel básico hasta avanzado de inglés. 80 horas"));
        listaCurso.add(new Curso("COAF1","Comunicación efectiva", "Fundamentos de la comunicación efectiva para el fortalecimiento de las relaciones interpersonales en espacios de trabajo. 100 horas"));
        listaCurso.add(new Curso("EXC2","Excel Avanzado", "Formulas, listas y plantillas en Excel. 50 horas"));
        listaCurso.add(new Curso("WOR1","Word básico", "Uso de elementos básicos en Word. Creación de Curriculum Vitae. 20 horas"));

        listAlumnos.add(new Alumno("Jaime Cerca", "15985367-7", LocalDate.of(1994, 9, 2)));
        listAlumnos.add(new Alumno("Ana López", "17345678-9", LocalDate.of(1992, 5, 15)));
        listAlumnos.add(new Alumno("Carlos García", "16543210-1", LocalDate.of(1990, 3, 22)));
        listAlumnos.add(new Alumno("María Torres", "18234567-2", LocalDate.of(1995, 7, 9)));
        listAlumnos.add(new Alumno("Pedro Sánchez", "17896543-4", LocalDate.of(1993, 1, 18)));
        listAlumnos.add(new Alumno("Laura Martínez", "16098765-6", LocalDate.of(1991, 11, 12)));
        listAlumnos.add(new Alumno("Jorge Gómez", "17432109-8", LocalDate.of(1996, 6, 27)));
        listAlumnos.add(new Alumno("Sofía Ramírez", "18345678-3", LocalDate.of(1997, 12, 5)));
    }
    public void matricular(String nombre, String rut, String fecha) {
        int year = 0;
        System.out.println(year);
    }
}
