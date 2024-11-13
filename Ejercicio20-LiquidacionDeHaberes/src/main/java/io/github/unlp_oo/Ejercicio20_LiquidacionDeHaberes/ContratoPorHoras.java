package io.github.unlp_oo.Ejercicio20_LiquidacionDeHaberes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoPorHoras extends Contrato{

	private LocalDate fechaFin;
	private double valorPorHora;
	private int horasPorMes;
	
	
	public ContratoPorHoras(LocalDate fechaInicio, LocalDate fechaFin, double valorPorHora, int horasPorMes) {
		super(fechaInicio);
		this.fechaFin = fechaFin;
		this.valorPorHora = valorPorHora;
		this.horasPorMes = horasPorMes;
	}
	
	
	public double sueldoBasico() {
		return this.valorPorHora*this.horasPorMes;
	}
	
	public int duracion() {
		return (int) ChronoUnit.DAYS.between(this.getFechaInicio(), this.fechaFin);
	}
	
	
	
}
