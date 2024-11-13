package io.github.unlp_oo.ejercicio17_AlquilerDePropiedades;

import java.time.LocalDate;

import io.github.unlp_oo.ejercicio14_IntervaloDeTiempo.Date;
import io.github.unlp_oo.ejercicio14_IntervaloDeTiempo.DateLapse;

public class Reserva extends DateLapse {
	
	private double precioPorNoche;

	public Reserva(LocalDate primera, LocalDate segunda, double precioPorNoche) {
		super(primera, segunda);
		this.precioPorNoche = precioPorNoche; 
	}
	
	
	
	public boolean overLaps(DateLapse fecha) {
		/**
		Retorna true si el período de tiempo del receptor se superpone con el recibido por parámetro
		**/
        return (this.includesDate(fecha.getFrom()) || this.includesDate(fecha.getTo()));
	}
	
	public double precioDeReserva(){
		return this.precioPorNoche*this.sizeInDays();
	}

	public double reembolso(Cancelacion tipo) {
		return tipo.reembolsar(this.getFrom(),this.precioDeReserva());
	}
	
	
	
	
}
