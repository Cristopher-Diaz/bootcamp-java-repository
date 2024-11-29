package model;

public class Pedido {
	private int id;
	private String fecha;
	private int monto;
    private Cliente cliente;
    
	public Pedido(int id, String fecha, int monto, Cliente cliente) {
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

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
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
