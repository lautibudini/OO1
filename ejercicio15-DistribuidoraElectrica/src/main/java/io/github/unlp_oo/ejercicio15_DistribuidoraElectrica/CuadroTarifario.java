package io.github.unlp_oo.ejercicio15_DistribuidoraElectrica;

public class CuadroTarifario {

	private double precioKWh;
	
	public CuadroTarifario( double precio) {
		this.precioKWh = precio;
	}
	
	public double getPrecioKWh() {
		return this.precioKWh;
	}
	
	public void setPrecioKWh(double precio) {
		this.precioKWh = precio;
	}
	
}
