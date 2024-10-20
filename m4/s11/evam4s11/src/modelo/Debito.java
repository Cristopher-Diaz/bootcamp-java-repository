package modelo;

import interfaces.PagoServicio;

public class Debito implements PagoServicio {

	@Override
	public String realizarPago() {
		return "Realizaste el pago con tarjeta de debito";
		
	}

}
