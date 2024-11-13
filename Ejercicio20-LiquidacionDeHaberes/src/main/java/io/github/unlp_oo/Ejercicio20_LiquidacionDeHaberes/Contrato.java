package io.github.unlp_oo.Ejercicio20_LiquidacionDeHaberes;

import java.time.LocalDate;

public abstract class Contrato {

	
	private LocalDate fechaInicio;
	
	public Contrato(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	
	public abstract int duracion();
	
	public abstract double sueldoBasico();
	
	public double valorAntiguedad(int Tiempo) {
		Tiempo += this.duracion();
		Tiempo = Tiempo / 365; //Ya que tiempo lo tengo en dias, lo  transformo en años.
		if (Tiempo < 5) {
			return this.sueldoBasico()*0.7;
		}else {
			if (Tiempo < 10) {
				return this.sueldoBasico()*0.5;
			}else {
				if (Tiempo < 20) {
					return this.sueldoBasico()*0.3;
				}else {
					return this.sueldoBasico();
				}
			}
		}
	}


	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

}
