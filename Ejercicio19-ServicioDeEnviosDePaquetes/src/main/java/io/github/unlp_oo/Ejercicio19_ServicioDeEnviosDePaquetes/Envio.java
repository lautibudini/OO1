package io.github.unlp_oo.Ejercicio19_ServicioDeEnviosDePaquetes;

import java.time.LocalDate;

public abstract class Envio {

	private LocalDate fechaDespacho;
	private String direccionOrigen;
	private String direccionDestino;
	private double pesoEnGramos;
	
	
	public Envio(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double pesoEnGramos) {
		this.fechaDespacho = fechaDespacho;
		this.direccionOrigen = direccionOrigen;
		this.direccionDestino = direccionDestino;
		this.pesoEnGramos = pesoEnGramos;
	}
	
	public abstract double calcularCosto();

	protected double getPesoEnGramos() {
		return this.pesoEnGramos;
	}
	
	protected LocalDate getFechaDespacho() {
		return this.fechaDespacho;
	}
	
	public boolean estaEntre(LocalDate Inicio, LocalDate Fin) {
		return (this.fechaDespacho.isEqual(Inicio) || this.fechaDespacho.isAfter(Inicio)) &&
	            (this.fechaDespacho.isEqual(Fin) || this.fechaDespacho.isBefore(Fin));
	}
	
}
