package io.github.unlp_oo.ejercicio17_AlquilerDePropiedades;

import java.time.LocalDate;

public interface Cancelacion {
	
	public double reembolsar(LocalDate FechaReserva, double monto);

}
