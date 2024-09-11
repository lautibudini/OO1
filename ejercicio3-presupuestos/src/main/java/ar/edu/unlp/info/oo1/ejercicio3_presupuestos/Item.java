package ar.edu.unlp.info.oo1.ejercicio3_presupuestos;

class Item{
	
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
	// Defino constructor de item.
	public Item(String detalle, int cantidad, double costoUnitario){
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	
	// Metodo a desarrollar en el UML.
	public double costo() {
		return this.costoUnitario*this.cantidad;
	}
	
	
	// Metodos agregados.
	
	public String getDetalle() {
		return this.detalle;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	
	
	
	
	
}