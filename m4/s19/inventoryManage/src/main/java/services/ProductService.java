package services;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductService {

    private List<Product> productos = new ArrayList<>();

    public List<Product> getAllProduct()
    {
        return productos;
    }
}
