package model;

public class Pedido {
	private int id;
	private String fecha;
	private String monto;
    private Cliente cliente;
    
	public Pedido(int id, String fecha, String monto, Cliente cliente) {
		this.id = id;
		this.fecha = fecha;
		this.monto = monto;
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fecha=" + fecha + ", monto=" + monto + ", cliente=" + cliente + "]";
	}
    
    
    
}
