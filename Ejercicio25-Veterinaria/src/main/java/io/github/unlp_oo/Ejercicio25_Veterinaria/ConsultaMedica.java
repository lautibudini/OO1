package io.github.unlp_oo.Ejercicio25_Veterinaria;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ConsultaMedica extends IntervencionMedica{
	
	
	public ConsultaMedica(Mascota mascota, LocalDate fechaAtencion,Medico medico) {
		super(mascota,fechaAtencion,medico);
	}

	@Override
	public double getAdicionalMateriales() {
		return 300;
	}


	@Override
	public double getAdicionalesDeServicio() {
		return this.getMedico().getAntiguedad()*100;
	}



	
	
	
	
}
