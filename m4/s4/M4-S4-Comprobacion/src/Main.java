import datos.Persona;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void calcularIMC(Persona persona){

        double imcPersona = persona.calcularIMC();
        String estadoPersona = persona.clasificarIMC(imcPersona);
        int edadPersona = persona.getEdad();
        String mayoriaEdadpersona = persona.mayoriaEdad();

        System.out.println("Estimado " + persona.getNombre() + ":");
        System.out.println("Calculando su IMC......");
        System.out.println("----------");
        System.out.printf("Su IMC es de: %.2f%n", imcPersona);
        System.out.println("Su estado es: " +  estadoPersona);
        System.out.println("----------");
        System.out.println("Su edad es: " + edadPersona);
        System.out.println("Usted es " + mayoriaEdadpersona + " de edad" );
        System.out.println("");
        System.out.println(persona);
        System.out.println("");


    }
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Cris", 25, 85, 1.77));
        personas.add(new Persona("Gato", 30, 75, 1.80));
        personas.add(new Persona("Ana", 22, 60, 1.65));
        personas.add(new Persona("Luis", 40, 95, 1.85));
        personas.add(new Persona("Marta", 35, 70, 1.70));

        // Calcular IMC para cada persona
        for (Persona persona : personas) {
            calcularIMC(persona);
        }

//        Persona persona = new Persona("Cris", 25, 85, 1.77);
//        calcularIMC(persona);
    }
}