package utilitario;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Auxiliar {
//    Aqui va toda la administracion del fichero
    ArrayList<String> lineas = new ArrayList<>();
    String nombreArchivo = "participantes.txt";

    public void leerFichero() {
        try {
            BufferedReader read = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            lineas.clear();
            while((linea = read.readLine()) != null) {
                boolean add = lineas.add(linea);
            }
            read.close();

        }catch (IOException e) {
            System.out.println("Ocurrió un error durante la lectura del archivo");
            e.printStackTrace();
        }
    }

    public String imprimir() {
        String salida="";
        int i=1;
        for(String temp : lineas) {
            salida = salida + i + " " + temp + "\n";
            i++;
        }
        return salida;
    }

    public void agregarParticipante(String nombreParticipante){
        try {
            FileWriter writer = new FileWriter(nombreArchivo, true);
            writer.write("\n");
            writer.write(nombreParticipante);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String seleccionarGanador() {
//        Crear el fichero para el ganador
        String archivoGanador = "ganador.txt";
        try {
            File archivo = new File(archivoGanador);

            if(archivo.createNewFile()) {
                System.out.println("Archivo creado " + archivo.getName());
            }else {
                System.out.println("El archivo ya existe, se sobreescribirá el contenido");
            }

        }catch(IOException e) {
            System.out.println("Ocurrió un error durante la creación del archivo");
            e.printStackTrace();
        }
//        Se seleciona al ganador
        leerFichero();
        Random random = new Random();
        int randomIndex = random.nextInt(lineas.size());
        String ganador = lineas.get(randomIndex);

//        Se escribe el ganador en el archivo
        try {
            FileWriter writer = new FileWriter(archivoGanador);
            writer.write(ganador);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//
        return ganador;
    }
}
