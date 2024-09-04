package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

class Ticket{
	
	
	private java.time.LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket( int cantP , double pesoTot, double precioTot) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantP;
		this.pesoTotal = pesoTot;
		this.precioTotal = precioTot;
	}
	
	public double impuesto(){
		return this.precioTotal * 0.21;
	}

	public java.time.LocalDate getFecha() {
		return fecha;
	}

	

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}


	public double getPesoTotal() {
		return pesoTotal;
	}



	public double getPrecioTotal() {
		return precioTotal;
	}

	
	
	
	
	
}