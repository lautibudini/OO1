package io.github.unlp_oo.Ejercicio25_Veterinaria;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Vacunacion extends IntervencionMedica{
	
	private String nombreVacuna;
	private double costoVacuna;
	
	public Vacunacion(Mascota mascota,LocalDate fecha, Medico medico, String nombreVacuna, double costoVacuna) {
		super(mascota,fecha, medico);
		this.nombreVacuna = nombreVacuna;
		this.costoVacuna = costoVacuna;
	}


	@Override
	public double getAdicionalMateriales() {
		return 500;
	}


	@Override
	public double getAdicionalesDeServicio() {
		return this.costoVacuna;
	}

}
	