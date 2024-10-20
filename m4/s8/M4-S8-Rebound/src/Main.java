import rebound.Alumno;
import rebound.Persona;
import rebound.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Crear un profe
        Profesor profesor = new Profesor("Cristopher Diaz", 2312321, "Desarrollo web");
//        Crear alumnos
        Alumno alumno1 = new Alumno("Alumno1", 33441155, profesor, "Cantar");
        Alumno alumno2 = new Alumno("Alumno2", 334755, profesor, "Correr");
        Alumno alumno3 = new Alumno("Alumno3", 334422, profesor, "Nada");
        Alumno alumno4 = new Alumno("Alumno4", 33434535, profesor, "Bailar");
        Alumno alumno5 = new Alumno("Alumno5", 334455777, profesor, "Cantar");
        Alumno alumno6 = new Alumno("Alumno6", 33445590, profesor, "Bailar");

//        Agregar alumnos a un array
        List<Persona> arrayPersonas = new ArrayList<>();
        arrayPersonas.add(profesor);
        arrayPersonas.add(alumno1);
        arrayPersonas.add(alumno2);
        arrayPersonas.add(alumno3);
        arrayPersonas.add(alumno4);
        arrayPersonas.add(alumno5);
        arrayPersonas.add(alumno6);

        System.out.println("el curso está compuesto por: ");
        for (Persona persona : arrayPersonas) {
            System.out.println(persona);
        }
    }
}