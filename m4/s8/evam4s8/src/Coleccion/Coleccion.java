package Coleccion;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Producto;
import modelo.Vegetales;
import modelo.Vestuario;

public class Coleccion {

	//definir catalogo de productos
	ArrayList<Producto> catalogo = new ArrayList<Producto>();
	
	//definir pre carga de productos
    public void precarga() {
    	Vestuario v1 = new Vestuario("polera","p01",2000,"s","rojo");
    	Vestuario v2 = new Vestuario("pantalon","p02",5000,"40","negro");
    	Vegetales ve1 = new Vegetales("papa","pp1",500,LocalDate.of(2024, 10, 4),LocalDate.of(2024, 10, 10));
    	Vegetales ve2 = new Vegetales("lechuga","l1",500,LocalDate.of(2024, 10, 4),LocalDate.of(2024, 10, 11));
    	
    	catalogo.add(v1);
    	catalogo.add(v2);
    	catalogo.add(ve1);
    	catalogo.add(ve2);
    }
	
    //mostrar catalogo
    public String listarProductos() {
    	String salida="";
    	for(Producto temp : catalogo) {
    		salida += temp.toString() + "\n\n";
    	}
    	return salida;
    }
	
    //Crear el carrito de compras
    ArrayList<Producto> carrito = new ArrayList<Producto>();
    
    public void agregarCarrito(Producto p) {
    	carrito.add(p);
    }
    
  //mostrar carrito
    public String listarCarrito() {
    	String salida="";
    	for(Producto temp : carrito) {
    		salida += temp.toString() + "\n\n";
    	}
    	return salida;
    }
    
    //Calcula el total a pagar
    public int TotalPagar() {
    	int pago=0;
    	for(Producto temp : carrito) {
    		pago = pago + temp.getPrecio();
    	}
    	return pago;
    }
    
    
    
    
    
    
    
    
    
    
    
	
}
