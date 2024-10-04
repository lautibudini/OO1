package ejercicio14b;

import java.time.LocalDate;

import io.github.unlp_oo.ejercicio14_IntervaloDeTiempo.Date;

public class DateLapse2 implements Date{

	private LocalDate from;
	private int sizeInDays;
	
	public DateLapse2(LocalDate desde, int cant) {
		this.from = desde;
		this.sizeInDays = cant;
	}
	
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		// PlusDays suma un int a una fecha.
		return this.from.plusDays(this.sizeInDays);
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	public boolean includesDate(LocalDate other) {
		//Reemplazo la variable TO por el metodo getTo.
		
		return (other.equals(this.from) || other.equals(this.getTo()) || 
				(other.isBefore(this.getTo()) && other.isAfter(this.from)) );
	}
	
	
}
