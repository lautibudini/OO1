package ar.edu.info.unlp.ejercicioDemo;


/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Balanza {

	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	

// Metodos implementados : 
	
	public Balanza() {
		this.ponerEnCero();
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.pesoTotal = 0;

	}
	
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal += producto.getPrecio();
		this.pesoTotal += producto.getPeso();
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.cantidadDeProductos, this.precioTotal, this.pesoTotal);
		return ticket;
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	
	
	
	
	
}
