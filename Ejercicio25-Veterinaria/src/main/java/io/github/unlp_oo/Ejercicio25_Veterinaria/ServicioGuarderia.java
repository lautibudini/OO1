package io.github.unlp_oo.Ejercicio25_Veterinaria;

import java.time.LocalDate;

public class ServicioGuarderia extends Servicio{
	
	private int cantDias;
	
	public ServicioGuarderia(Mascota mascota,  LocalDate fecha,int cantDias) {
		super(mascota,fecha);
		this.cantDias = cantDias;
	}

	@Override
	public double calcularCostoServico() {
		double montoFinal = this.cantDias * 500;
		if (this.getMascota().getCantServicios() >= 5) {
			montoFinal-= (montoFinal*0.1);
		}
		return montoFinal;
	}



}
