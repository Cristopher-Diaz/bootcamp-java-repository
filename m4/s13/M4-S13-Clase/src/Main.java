import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Interfaz SET - No permite valores duplicados
        System.out.println("Interfaz SET - No permite valores duplicados");
        HashSet<String> conjunto = new HashSet<>();

        //agregar elemento
        conjunto.add("Manzana");
        conjunto.add("Naranja");

        //intentamos agregar un elemento duplicado
        boolean añadido = conjunto.add("Manzana");

        //imprimir
        System.out.println("Elementos del HashSet " + conjunto);

        //comprobar si existe un elemento
        if(conjunto.contains("Piña")) {
            System.out.println("El HashSet sí contiene Piña");
        }else {
            System.out.println("El HashSet no contiene Piña");
        }

        //eliminar elemento
        conjunto.remove("Naranja");
        System.out.println("Elementos del HashSet " + conjunto);



        //Interfaz TREESET - No permite valores duplicados - Mantiene ordenados los datos ASC
        System.out.println("Interfaz TREESET - No permite valores duplicados - Mantiene ordenados los datos ASC");
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(23);
        numeros.add(1);

//        Intentar agregar un duplicado
        boolean add = numeros.add(10);

        System.out.println("Elementos de TreeSet " + numeros);
        System.out.println("Valor añadido duplicado " + add);

        //Obtener el primer elemento
        System.out.println("Primer elemento: " + numeros.first());
        //obtener el ultimo elemento
        System.out.println("Ultimo elemento: " + numeros.last());

        //eliminar número
        numeros.remove(5);
        System.out.println("Elementos del TreeSet" + numeros);


        //LinkedHashSet - No permite valores duplicados - Mantiene el orden de insercion
        LinkedHashSet<String> ciudades = new LinkedHashSet<>();
        ciudades.add("Santiago");
        ciudades.add("Viña del mar");
        ciudades.add("Concepción");
        ciudades.add("Valdivia");

//        intentar agregar duplicado
        boolean addLHS = ciudades.add("Santiago");

        System.out.println("Elementos de TreeSet " + ciudades);
        System.out.println("Valor añadido duplicado " + addLHS);

        /*ArrayList

      ● Array redimensionable.
      ● Aumenta su tamaño según crece la colección de elementos (dinámico).
      ● Permite elementos de todo tipo, incluso nulos.
      ● Mejor rendimiento.*/

        ArrayList<String> lista2 = new ArrayList<>();

        //buena practica
        List<String> lista = new ArrayList<>();


        //2. interfaz List

        // ArrayList esta construido con base a un Arreglo Dinamico.
        // LinkedList esta construido con base a una Lista doblemente enlazada.

	/*	Acceso:
			ArrayList permite un acceso rápido a los elementos por índice (O(1)), ya que es posible acceder directamente a cualquier elemento del arreglo.
			LinkedList, en cambio, tiene un acceso más lento (O(n)) porque debe recorrer los nodos desde el inicio hasta llegar al índice especificado.

	Inserción y Eliminación:
ArrayList tiene un rendimiento más lento para insertar o eliminar elementos en el medio o inicio de la lista (O(n)), ya que se deben desplazar los elementos.
LinkedList permite inserciones y eliminaciones rápidas al inicio, medio o fin de la lista (O(1) si ya se tiene el nodo), ya que solo necesita actualizar los enlaces entre nodos.



	*/
        LinkedList<String> animales = new LinkedList<>();

        animales.add("Perro");
        animales.add("Gato");

        //agregar elemento al inicio
        animales.addFirst("Leon");
        //Agregar elemento al final
        animales.addLast("Tigre");

        //imprimir
        System.out.println("Animales:" + animales);



        //3. Queue  -- COLAS  --- Estructura de Datos que representa la cola de un banco
        // primero que llega es el primero que atiende FIFO

        //PILAS   --Estructura de datos que representa la pila de platas
        //ultimo que llega es el primero que se atiende LIFO

        Queue<String> cola = new LinkedList<>();

        //agregar elementos
        cola.add("Elemento 1");
        cola.add("Elemento 2");
        cola.add("Elemento 3");

        //imprimir
        System.out.println("Elementos en la cola " + cola);

        //Acceder al primer elemento de la cola sin eliminarlo
        String primero = cola.peek();
        System.out.println("Primer elemento de la cola " + primero);

        //Eliminar primer elemento de la cola
        String eliminado = cola.poll();
        System.out.println("Elemento eliminado " + eliminado);

        // Recorrer e imprimir todos los elementos de la cola
        System.out.println("Recorrido de la cola:");
        for (String elemento : cola) {
            System.out.println(elemento);
        }

        //Interfaz MAP : Permite utilizar una clave asociada a un valor - dupla
        Map<String, Integer> mapaEdades = new HashMap<>();

        //   <clave, valor>  ---tipo diccionario

        //agregar elementos al map
        mapaEdades.put("Juan", 30);
        mapaEdades.put("Ana", 25);
        mapaEdades.put("Luis", 35);

        //Mostrar el contenido
        System.out.println("Contenido del HashMap" + mapaEdades);

        //obtener el valor usando la clave
        String nombre = "Juan";
        int edad = mapaEdades.get(nombre);

        System.out.println("La edad de " + nombre + " es " + edad);

        //eliminar
        mapaEdades.remove("Luis");
        System.out.println("Contenido del HashMap" + mapaEdades);

    }



}