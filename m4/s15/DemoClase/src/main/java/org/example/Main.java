package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        // URL de la API
        String apiUrl = "https://cl.dolarapi.com/v1/cotizaciones/usd";
        try {

            // Crear objeto URL
            URL url = new URL(apiUrl);

            // Abrir conexión
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Configurar el método de la solicitud
            connection.setRequestMethod("GET");

            // Obtener el código de respuesta (por ejemplo, 200 para éxito)
            int responseCode = connection.getResponseCode();
            System.out.println("Código de respuesta: " + responseCode);

            // Si la respuesta es exitosa (código 200)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Leer la respuesta de la API
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                // Leer línea por línea
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                // Cerrar el buffer
                in.close();

                // Imprimir la respuesta
                System.out.println("Respuesta de la API: " + content.toString());
            } else {
                System.out.println("Error en la solicitud a la API");
            }

            // Cerrar la conexión
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}