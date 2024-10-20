public class Main {
    public static void main(String[] args) {
        //1. WHILE
        //Imprimir los numeros del 1 al 5
        int i=1; //contador
        while(i<=5) { //Condicion de termino
            System.out.println(i);
            i++; //i=i+1 incremento
        }

        //2. FOR
        //Imprimir los números del 1 al 5
        for(i=1; i<=5;i++) {
            System.out.println(i);
        }

        //3. DO - WHILE
        //Imprimir los números del 1 al 5
        i=1;
        do {
            System.out.println(i);
            i++;
        }while(i<=5);
    }
}