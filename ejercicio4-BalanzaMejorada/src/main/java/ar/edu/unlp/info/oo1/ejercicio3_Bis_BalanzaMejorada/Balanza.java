package ar.edu.unlp.info.oo1.ejercicio3_Bis_BalanzaMejorada;
import java.util.List;
import java.util.ArrayList;


public class Balanza {

	// La unica variable de balanza es la lista de productos,
	// Donde calculamos y procesamos todo para pasarselo a ticket.
	private List<Producto> productos;
	

// Metodos implementados : 
	
	public Balanza() {
		this.ponerEnCero();
	}
	
	public void ponerEnCero() {
		this.productos= new ArrayList<Producto>();
	}
	
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		
		Ticket ticket = new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal() );
		ponerEnCero();
		return ticket;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(Producto::getPeso).sum();
	}
	
	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(Producto::getPrecio).sum();
	}
	
	
	// Nuevo metodo agregado : 
	
	public List<Producto> getProductos(){
		return new ArrayList<Producto>(this.productos);
	}
	
	
	
	
	
}
