package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);

    public static boolean menu () {
        boolean loop = true;

        System.out.println("Welcome to practice program.");
        System.out.println("Options: ");
        System.out.println("1.- One random joke");
        System.out.println("2.- 10 random jokes");
        System.out.println("3.- Exit program");

        int opt = read.nextInt();

        switch (opt) {
            case 1: getOneJoke();
                break;
            case 2: getTenJoke();
                break;
            case 3: loop = false;
                break;
        }

        return loop;
    }

    private static void getOneJoke() {
        String endpoint = "https://official-joke-api.appspot.com/random_joke";
        String jokeResponse = getData(endpoint);

        if (jokeResponse != null) {
            // Buscar la posición de las partes relevantes (setup y punchline)
            String setup = jokeResponse.split("\"setup\":\"")[1].split("\",")[0];
            String punchline = jokeResponse.split("\"punchline\":\"")[1].split("\"")[0];

            System.out.println("Chiste: " + setup + " - " + punchline);
        }

    }

    private static void getTenJoke() {
        String endpoint = "https://official-joke-api.appspot.com/random_ten";
        String jokesResponse = getData(endpoint);

        if (jokesResponse != null) {
            // Parsear la respuesta como un array JSON y mostrar cada chiste
            JSONArray jokesArray = new JSONArray(jokesResponse);

            for (int i = 0; i < jokesArray.length(); i++) {
                JSONObject jokeObject = jokesArray.getJSONObject(i);
                String setup = jokeObject.getString("setup");
                String punchline = jokeObject.getString("punchline");

                // Mostrar cada chiste con su índice
                System.out.println("Chiste " + (i + 1) + ": " + setup + " - " + punchline);
            }
        }

    }

    private static String getData (String apiUrl) {
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            System.out.println("Código de respuesta: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                in.close();
                connection.disconnect();

                return content.toString();
            } else {
                System.out.println("Error en la petición GET");
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        while(menu());
        System.out.println("saliendodooooo");
    }
}