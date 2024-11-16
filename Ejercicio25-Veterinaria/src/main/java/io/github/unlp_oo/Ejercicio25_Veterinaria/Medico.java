package io.github.unlp_oo.Ejercicio25_Veterinaria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Medico {
	
	private String nombre;
	private LocalDate fechaIngresoV;
	private double honorarioPorAtencion;
	
	public Medico(String nombre, LocalDate fechaIngresoV, double honorarioPorAtencion) {
		this.nombre = nombre;
		this.fechaIngresoV = fechaIngresoV;
		this.honorarioPorAtencion = honorarioPorAtencion;
	}
	
	
	public double getHonorarios() {
		return this.honorarioPorAtencion;
	}
	
	public int getAntiguedad() {
		return (int) ChronoUnit.YEARS.between(this.fechaIngresoV, LocalDate.now());
	}

}
