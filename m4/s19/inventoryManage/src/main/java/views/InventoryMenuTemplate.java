package views;

import java.util.Scanner;

public abstract class InventoryMenuTemplate {
    private Scanner read = new Scanner(System.in);

//    Metodos abstractos a sobreescribir en clases hijas
    public abstract void exportData ();
    public abstract void createProduct ();
    public abstract void addStock ();
    public abstract void removeStock ();
    public abstract void listProducts ();
    public abstract void endProgram ();


    public void startMenu (){
        int option = -1;
        do {
            System.out.println("--- Menú de Inventario ---");
            System.out.println("1. Crear producto");
            System.out.println("2. Agregar Stock");
            System.out.println("3. Eliminar Stock");
            System.out.println("4. Listar productos");
            System.out.println("5. Exportar datos");
            System.out.println("6. Terminar programa");

            option = read.nextInt();
            switch (option){
                case 1: createProduct();
                    break;
                case 2: addStock();
                    break;
                case 3: removeStock();
                    break;
                case 4: listProducts();
                    break;
                case 5: exportData();
                    break;
                case 6: endProgram();
                    break;
                default: System.out.println("Opción inválida, Intente nuevamente");
            }
        } while (option != 6);
    }

}
