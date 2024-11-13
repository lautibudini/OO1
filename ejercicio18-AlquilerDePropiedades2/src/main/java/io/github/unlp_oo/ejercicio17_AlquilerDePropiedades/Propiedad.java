package io.github.unlp_oo.ejercicio17_AlquilerDePropiedades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import io.github.unlp_oo.ejercicio14_IntervaloDeTiempo.DateLapse;

public class Propiedad {
	
	private String direccion;
	private String nombre;
	private double precioPorNoche;
	private List<Reserva> reservas;
	private Cancelacion tipoCancelacion;
	
	public Propiedad(String direccion, String nombre, double precioPorNoche) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<Reserva>();
		
	}
	
	
	public boolean hayDisponibilidad(LocalDate ingreso, LocalDate egreso){
		/* 
		 * La función verifica que haya disponibilidad en las fechas pasadas como parametro.
		 */
		return this.reservas.stream().
				anyMatch(reservas -> reservas.overLaps(new DateLapse(ingreso,egreso)));
	}
	
	
	public boolean crearReserva(LocalDate ingreso, LocalDate egreso) {
		/*
		 * Esta función lo que hace es crear una reserva , validando que no exista  
		 * para agregarla a la lista.
		 */
		if ( this.hayDisponibilidad(ingreso, egreso) ) {
			reservas.add(new Reserva(ingreso,egreso,this.precioPorNoche));
			return true;
		}
		return false;
	}
	
	public double precioDeReserva(Reserva reserva) {
		/* 
		 * Lo que hace es pedirle a la reserva su costo.
		 */
		
		return reserva.precioDeReserva();
	}
	
	
	
	private boolean cancelar(Reserva reserva) {
		/*
		 * Recibimos una reserva y la borramos. (No hace falta recorrer para buscarla)
		*/
			
		return this.reservas.remove(reserva);
		
	}
	

	public double gananciaEnPeriodo(LocalDate inicio, LocalDate fin) {
		/* La función recibe dos periodos de tiempo y saca las ganancias del 
		 * propietario en ese periodo. Recorriendo las reservas filtrando las 
		 * que pertenecen a ese periodo para luego cada una de esas reservas saca su 
		 * costo , al final sumo todo.
		 */
		
		
		return  this.reservas.stream()
				.filter(reservas -> reservas.overLaps(new DateLapse(inicio,fin)))
				.mapToDouble(reservas -> reservas.precioDeReserva()).sum();
	}
	
	
	
	//NUEVO METODO
	
	public double MontoDeCancelacion(Reserva reserva){
	  double reembolso = this.tipoCancelacion.reembolsar(reserva.getFrom(),reserva.precioDeReserva());
	  this.cancelar(reserva);
	  return reembolso;
	}
	
	
}

