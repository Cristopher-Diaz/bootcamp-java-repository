import java.io.*;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) {

        //Nombre del fichero
        String nombreArchivo = "miArchivo.txt";

        //Crear el fichero


        try {
            File archivo = new File(nombreArchivo);

            if(archivo.createNewFile()) {
                System.out.println("Archivo creado " + archivo.getName());
            }else {
                System.out.println("El archivo ya existe, se sobreescribirá el contenido");
            }

            //Escribir en el archivo
            FileWriter writer = new FileWriter(archivo);
            writer.write("Primera línea de texto del archivo\n");
            writer.write("Segunda línea de texto del archivo\n");
            writer.write("Hello word\n");
            writer.close();
            System.out.println("Escritura del archivo completada");

        }catch(IOException e) {
            System.out.println("Ocurrió un error durante la creación del archivo");
            e.printStackTrace();
        }
        // lectura de fichero
        try {
            BufferedReader read = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            System.out.println("Contenido del archivo");

            while((linea = read.readLine()) != null) {
                System.out.println(linea);
            }
            read.close();

        }catch (IOException e) {
            System.out.println("Ocurrió un error durante la lectura del archivo");
            e.printStackTrace();
        }



    }

}

