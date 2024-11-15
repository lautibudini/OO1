package io.github.unlp_oo.ejercicio23_MercadoDeObjetos;

public class Producto {
	
	private String nombre; 
	private String categoria;
	private double precio; 
	private int cantUnidadesDisponibles;
	private Usuario vendedor;
	
	
	public Producto(String nombre, String categoria, double precio, int cantUnidadesDisponibles
			, Usuario vendedor) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.cantUnidadesDisponibles = cantUnidadesDisponibles;
	    this.vendedor = vendedor;
	}
	
	public void crearPedido(Pago formaPago, Envio formaEnvio, Producto producto,
			int cantidad, Usuario cliente) {
		if (this.HayStock(cantidad)) { // si hay stock
			this.ActualizaStock(cantidad); // actualizamos el stock disponible
			// Agregamos el pedido
			cliente.agregarPedido(new Pedido(producto, formaEnvio, formaPago,cantidad,
					this.vendedor.getDireccion(), cliente.getDireccion()));
		}
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public String getCategoriaProducto() {
		return this.categoria;
	}
	
	public boolean HayStock(int cant) {
		return this.cantUnidadesDisponibles >= cant;
	} 
	
	public void ActualizaStock(int nuevo) {
		this.cantUnidadesDisponibles-= nuevo;
	}

}
