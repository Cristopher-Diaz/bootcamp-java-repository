package modelo;

import java.time.LocalDate;

public class Vegetales extends Producto{
	private LocalDate fechaEnvasado;
	private LocalDate fechaCaducidad;
	
/*  LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);
        LocalDate fechaEspecifica = LocalDate.of(2024, 3, 15);
        int año = fecha.getYear();
        int mes = fecha.getMonthValue();  // El número del mes (1-12)
        int dia = fecha.getDayOfMonth();
        //salida estandar : 2024-03-15
*/

	public Vegetales(String nombre, String codigo, int precio, LocalDate fechaEnvasado, LocalDate fechaCaducidad) {
		super(nombre, codigo, precio);
		this.fechaEnvasado = fechaEnvasado;
		this.fechaCaducidad = fechaCaducidad;
	}

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Vegetales [nombre=" + super.nombre + ", codigo=" + super.codigo + ", precio=" + super.precio + ", FechaEnvasado=" + fechaEnvasado + ", FechaCaducidad=" + fechaCaducidad + "]";
	}
	
	

	
}
