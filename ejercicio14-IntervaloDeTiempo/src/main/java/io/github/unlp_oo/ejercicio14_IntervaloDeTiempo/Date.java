package io.github.unlp_oo.ejercicio14_IntervaloDeTiempo;

import java.time.LocalDate;

public interface Date {
	
	public LocalDate getFrom();
	public LocalDate getTo();
	public int sizeInDays();
	public boolean includesDate(LocalDate other);
	
	
}
