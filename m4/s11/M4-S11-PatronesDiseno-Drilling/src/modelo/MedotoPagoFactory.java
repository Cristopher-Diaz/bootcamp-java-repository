package modelo;

import interfaces.PagoServicio;

public class MedotoPagoFactory {
    public static PagoServicio getFormaPago(int tipo) {
        switch(tipo) {
            case 1 : return new Efectivo();
            case 2 : return new Debito();
        }
        return null;
    }
}
