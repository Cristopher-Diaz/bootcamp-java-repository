package views;

import services.FileService;
import services.ProductService;


public class InventoryMenu extends InventoryMenuTemplate{
    private ProductService productService = new ProductService();
    private FileService fileService = new FileService();


    @Override
    public void exportData() {
        System.out.println("Exportando datos");
        fileService.exportInventoryData(productService.getAllProduct());
    }

    @Override
    public void createProduct() {

    }

    @Override
    public void addStock() {

    }

    @Override
    public void removeStock() {

    }

    @Override
    public void listProducts() {

    }

    @Override
    public void endProgram() {

    }

}

