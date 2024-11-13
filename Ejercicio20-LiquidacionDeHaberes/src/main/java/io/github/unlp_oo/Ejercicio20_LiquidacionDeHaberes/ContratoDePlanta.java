package io.github.unlp_oo.Ejercicio20_LiquidacionDeHaberes;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class ContratoDePlanta extends Contrato{


	private double sueldoMensual;
	private double montoPorConyuge;
	private double montoPorHijo;
	
	
	public ContratoDePlanta(LocalDate fechaInicio, double sueldoMensual, double montoPorConyuge, double montoPorHijo) {
		super(fechaInicio);
		this.sueldoMensual = sueldoMensual;
		this.montoPorConyuge = montoPorConyuge;
		this.montoPorHijo = montoPorHijo;
	}
	
	
	public double sueldoBasico() {
		return this.sueldoMensual+this.montoPorConyuge+this.montoPorHijo;
	}

	public int duracion() {
		return (int) ChronoUnit.DAYS.between(this.getFechaInicio(), LocalDate.now());
	}
		
		
}
