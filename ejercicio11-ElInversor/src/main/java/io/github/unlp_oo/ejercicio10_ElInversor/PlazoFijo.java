package io.github.unlp_oo.ejercicio10_ElInversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversiones{

	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	
	
	public PlazoFijo(double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = LocalDate.now() ;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}

	
	public PlazoFijo(LocalDate fecha, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = fecha ;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}


	public double valorActual() {
		double dias = ChronoUnit.DAYS.between(fechaDeConstitucion, LocalDate.now());
		return this.montoDepositado + (this.montoDepositado * this.porcentajeDeInteresDiario * dias);
	}
	
	
	
	
}
