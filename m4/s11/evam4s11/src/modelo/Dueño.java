package modelo;

public class Dueño {
	//1. Declarar una instancia estática y privada
		private static Dueño d;
		private String nombre = "Francisco Puentes";
		//2. Constructor tiene que ser privado
		private Dueño() {}
		
		//3. Método público que devuelva la instancia única.
		
		public static Dueño getInstancia() {
			if(d == null) {
				d = new Dueño();
			}
			return d;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return "Dueño [nombre=" + nombre + "]";
		}
		
		
}
