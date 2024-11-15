package io.github.unlp_oo.ejercicio23_MercadoDeObjetos;

public class Pedido {
	
	private int cantidadPedidos;
	private Producto producto;
	private Envio formaEnvio;
	private Pago formaPago;
	private String dirVendedor;
	private String dirCliente;
	
	
	public Pedido(Producto producto, Envio formaEnvio, Pago formaPago, int cantidadPedidos,
			String dirVendedor, String dirCliente) {
		this.cantidadPedidos = cantidadPedidos;
		this.producto = producto;
		this.formaEnvio = formaEnvio;
		this.formaPago = formaPago;
		this.dirVendedor = dirVendedor;
		this.dirCliente = dirCliente;
	}
	 
	
	public double getCostoPedido() {
		double precioBase = this.cantidadPedidos*this.producto.getPrecio();
		return this.formaPago.getCostoFinal(precioBase)+ this.formaEnvio.getCostoEnvio(this.dirVendedor,
				this.dirCliente);
	}

	
	public String getCategoria() {
		return this.producto.getCategoriaProducto();
	}
	
	public void agregarEnBag(Bolsa<String> bag) {
		bag.add(this.producto.getCategoriaProducto());
	}
}
