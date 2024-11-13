package io.github.unlp_oo.ejercicio17_AlquilerDePropiedades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CancelacionModerada implements Cancelacion {

	@Override
	public double reembolsar(LocalDate fechaReserva, double monto) {
		int dias = this.sizeInDays(fechaReserva);
		if (dias >=7 ) {
			return monto;
		}else {
			if (dias >=2) {
				return monto*0.5;
			}
		}
		return 0;
	}
	
	
	public int sizeInDays(LocalDate fechaReserva) {
		//Retorna la cant de dias entre la fecha FROM y la fecha TO.
		return (int) ChronoUnit.DAYS.between(LocalDate.now(), fechaReserva);
	}
	
}
