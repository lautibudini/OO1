package io.github.unlp_oo.Ejercicio25_Veterinaria;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class IntervencionMedica extends Servicio{
	
	private Medico medico;
	
	public IntervencionMedica(Mascota mascota,LocalDate fechaServicio, Medico medico) {
		super(mascota,fechaServicio);
		this.medico = medico;
	}
	
	public abstract double getAdicionalMateriales();
	public abstract double getAdicionalesDeServicio();
	
	protected Medico getMedico() {
		return this.medico;
	}
	
	public double calcularCostoServico() {
		double montoFinal = this.medico.getHonorarios(); 
		montoFinal+= this.getAdicionalMateriales();
		if (this.getFechaServicio().getDayOfWeek() == DayOfWeek.SUNDAY ) {
			montoFinal+= 200;
		}
		montoFinal+= this.getAdicionalesDeServicio();
		return montoFinal;
	}
	
}
