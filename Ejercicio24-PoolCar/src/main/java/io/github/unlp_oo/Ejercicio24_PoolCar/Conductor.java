package io.github.unlp_oo.Ejercicio24_PoolCar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Conductor extends Usuario{
	
	private Vehiculo coche;
	
	public Conductor(String nombre, double saldo, Vehiculo coche) {
		super(nombre, saldo);
		this.coche = coche;
	}

	public int cantAños() {
		return (int) ChronoUnit.YEARS.between(this.coche.getFechaDeFabricacion(), LocalDate.now());
	}
	
	@Override
	public void cargarSaldo(double monto) {
		int años = this.cantAños();
		if (años < 5) {
			this.setSaldo(this.getSaldo() - (monto*0.01));
		}else {
			this.setSaldo(this.getSaldo() - (monto*0.1));
		}
		
	}

	
	public void procesarMontoViaje(double monto) {
		// se le bonifica el 0.1% del valor del vehículo utilizado para el viaje.
		this.setSaldo(this.getSaldo() - (this.coche.getValorMercado()*0.01));
	}
	
	
}
