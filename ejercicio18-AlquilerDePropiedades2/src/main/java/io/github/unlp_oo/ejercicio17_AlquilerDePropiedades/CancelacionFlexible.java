package io.github.unlp_oo.ejercicio17_AlquilerDePropiedades;

import java.time.LocalDate;

public class CancelacionFlexible implements Cancelacion {

	
	@Override
	public double reembolsar(LocalDate FechaReserva, double monto) {
		if (LocalDate.now().isBefore(FechaReserva)) {
			return monto;
		}
		return 0;
	}


	
}
