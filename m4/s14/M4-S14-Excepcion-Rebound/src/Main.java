public class Main {
    private static int[] numeradores = {4, 8, 16, 32, 64, 128, 256, 512};
    private static int[] denominadores = {2, 0, 4, 4, 0, 8};


    public static void dividir () {
        for (int i = 0; i < numeradores.length; i++){
            try {
                int numerador = numeradores[i];
                int denominador = denominadores[i];

                if(denominador == 0) {
                    throw new ArithmeticException("Error: División por cero " + "("+ numerador +"/" + denominador + ")");
                }
                int resultado = numerador/denominador;
                System.out.println("La division entre " +numerador+ " y "+ denominador + " es: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Indice fuera de los límites del arreglo.");
            }
        }
    }

    public static void main(String[] args) {
        try {
            dividir();
        } catch (Exception e) {
            // Captura de cualquier otra excepción que pudiera ocurrir
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            System.out.println("ExepciOn en el main, fin del programa.");
        }
    }
}