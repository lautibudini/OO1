package io.github.unlp_oo.ejercicio23_MercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private String direccion;
	private List<Pedido> productosPedidos;
	private List<Producto> productosALaVenta;
	
	
	public Usuario(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productosPedidos = new ArrayList<Pedido>();
		this.productosALaVenta = new ArrayList<Producto>();
	}


	public void agregarProductoVenta(Producto producto) {
		this.productosALaVenta.add(producto);
	}
	
	public void agregarPedido(Pedido pedido) {
		this.productosPedidos.add(pedido);
	}
	
	public Bolsa<String> productosPorCategoria() {
		Bolsa<String> bag = new Bolsa<String>();
		this.productosPedidos.forEach(Pedido -> Pedido.agregarEnBag(bag));
	    return bag;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	

}
