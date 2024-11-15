package io.github.unlp_oo.Ejercicio24_PoolCar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
	
	private String origen;
	private String destino;
	private double costoTotal;
	private Vehiculo coche;
	private LocalDate fechaDeViaje;
	
	private List<Usuario> pasajeros;
	
	public Viaje(String origen, String destino, double total, 
			Vehiculo coche, LocalDate fechaDeViaje) {
		
		this.origen = origen;
		this.destino = destino;
		this.costoTotal = total ; 
		this.coche = coche;
		this.fechaDeViaje = fechaDeViaje;
		this.pasajeros = new ArrayList<Usuario>();
		//this.pasajeros.add() agrego al conductor, sacando de vehiculo dueño
		}
	
	public void agregarPasajero(Pasajero pasajero) {
		this.pasajeros.add(pasajero);
	}
	
	
	public boolean puedeIngresarPersona(){
    	if( this.pasajeros.size() < this.coche.getCantPasajerosMax() &&
    			ChronoUnit.DAYS.between(this.fechaDeViaje, LocalDate.now()) <= 2) {
    		return true;
    	}
    	return false;
    }
	
	
	public void procesarViaje() {
		double montoDividido = this.costoTotal / (this.pasajeros.size());
		this.pasajeros.forEach(User -> User.procesarMontoViaje(montoDividido));
	}

	
	public LocalDate getFechaDeViaje() {
		return this.fechaDeViaje;
	}
	
	public boolean esAntesDe30Dias() {
		return this.fechaDeViaje.isBefore(LocalDate.now()) && 
				( ChronoUnit.DAYS.between(this.fechaDeViaje,LocalDate.now()) < 30 );
	}
	
}
