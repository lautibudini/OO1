package io.github.unlp_oo.Ejercicio25_Veterinaria;

import java.time.LocalDate;

public abstract class Servicio {

	
    private Mascota mascota;
    private LocalDate fechaServicio;
	
	public Servicio( Mascota mascota, LocalDate fechaServicio) {
		this.mascota = mascota;
		this.fechaServicio = fechaServicio;
	}
	
	public abstract double calcularCostoServico();
	
	protected Mascota getMascota() {
		return this.mascota;
	}
	
	protected LocalDate getFechaServicio() {
		return this.fechaServicio;
	}
	
}
