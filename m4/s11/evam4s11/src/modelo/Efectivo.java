package modelo;

import interfaces.PagoServicio;

public class Efectivo implements PagoServicio{

	@Override
	public String realizarPago() {
		return "Realizaste el pago en efectivo";
	}

}
