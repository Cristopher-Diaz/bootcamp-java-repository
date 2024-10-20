public class Main {
    public static void main(String[] args) {
        // Definir una bolsa para Zapatos con un tamaño de 3
        Bolsa<Zapatos> bolsaDeZapatos = new Bolsa<>(3);

        bolsaDeZapatos.addItem(new Zapatos("Nike"));
        bolsaDeZapatos.addItem(new Zapatos("Adidas"));
        bolsaDeZapatos.addItem(new Zapatos("Puma"));

        // Intentar agregar un cuarto zapato (la bolsa está llena)
        bolsaDeZapatos.addItem(new Zapatos("Reebok"));

        // Imprimir los elementos en la bolsa de zapatos
        bolsaDeZapatos.printItems();

        System.out.println("----");

        // Definir una bolsa para Poleras con un tamaño de 2
        Bolsa<Poleras> bolsaDePoleras = new Bolsa<>(2);

        bolsaDePoleras.addItem(new Poleras("Rojo"));
        bolsaDePoleras.addItem(new Poleras("Azul"));

        // Imprimir los elementos en la bolsa de poleras
        bolsaDePoleras.printItems();
    }
}
