package io.github.unlp_oo.Ejercicio24_PoolCar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Usuario{

	private List<Viaje> viajesRealizados;
	
	public Pasajero(String nombre, double saldo) {
		super(nombre, saldo);
		this.viajesRealizados = new ArrayList<Viaje>();
	}

	@Override
	public void cargarSaldo(double monto) {
		//Debo fijarme si algun viaje  se hizo hace menos de 30 dias , para el descuento.
		double montoComision = 0;
		if( this.viajesRealizados.size() >= 1 ) {
			if (this.viajesRealizados.stream().anyMatch(Viaje -> Viaje.esAntesDe30Dias())) {
				montoComision = monto - (monto*0.1);
		}
	}		
		
		this.setSaldo(this.getSaldo() + montoComision);
	}
	
	public void registrarmeEnViaje(Viaje viaje) {
		if (this.getSaldo() > 0  && viaje.puedeIngresarPersona()){
			viaje.agregarPasajero(this);
			this.viajesRealizados.add(viaje);
		}
	}

	@Override
	public void procesarMontoViaje(double monto) {
		// a un pasajero, se bonifica $500 si el usuario hizo un viaje en el pasado 
		double montoFinal = monto;
		if (this.viajesRealizados.size() > 1) {
			montoFinal = this.getSaldo() - (monto - 500); 
			this.setSaldo(montoFinal);
		}else {
			montoFinal = this.getSaldo() - monto; 
			this.setSaldo(montoFinal);
		}
		
	}

}
