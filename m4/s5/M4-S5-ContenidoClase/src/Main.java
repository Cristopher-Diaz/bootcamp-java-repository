public class Main {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};

        //for de objetos -- Clases y Objetos
        for(int temp : numeros) {
            System.out.println(temp);
        }

        // numeros= |obj1 |obj2 |obj3 |obj4 |obj5|    // length = 5
        //           [0]   [1]   [2]   [3]   [4]

        for(int i = 0 ; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //--------------------------------
        char [] letras = {'a','e','i','o','u'};

        for(char temp : letras) {
            System.out.println(temp);
        }
    }
}
