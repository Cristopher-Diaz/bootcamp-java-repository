package modelo;

import interfaces.PagoServicio;

public class MetodoPagoFactory {

	public static PagoServicio getFormaPago(int tipo) {
		
		switch(tipo){
		case 1 : return new Debito();
		case 2: return new Efectivo();
		}
		return null;
	}
}
