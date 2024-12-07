package proyectoMaven;

public class Principal {
	 
	public static void main(String[] args) {
		Panaderia p = new Panaderia("Kary", "Calle Valparaiso", "Juan Perez");
		
		System.out.println("El nombre de la Panaderia es " + p.getNombre());
		
		System.out.println(p.toString());
 
	}
 
}
