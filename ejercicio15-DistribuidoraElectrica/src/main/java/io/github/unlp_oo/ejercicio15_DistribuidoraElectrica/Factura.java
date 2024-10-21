package io.github.unlp_oo.ejercicio15_DistribuidoraElectrica;

import java.time.LocalDate;

public class Factura {
	

	private Persona usuario; 
	private LocalDate fechaEmision;
	private double bonificación;
	private double montoFinal;
	
	
	public double getBonificación() {
		return bonificación;
	}


	public double getMontoFinal() {
		return montoFinal;
	}


	public Factura(Persona usuario, double bonificacion, double montoFinal) {
		this.usuario = usuario;
		this.fechaEmision = LocalDate.now();
		this.bonificación = bonificacion;
		this.montoFinal = montoFinal;
	}
	
	public String imprimirFactura() {
		return " Datos de la factura : \n" + " Nombre de cliente :  " + this.usuario + "\n"+
	           "Fecha de emision :  " + this.fechaEmision + "\n" + " Bonificación :  " +
				this.bonificación + "\n" + "Monto Total : " + this.montoFinal; 
	}
	
	
	
}
