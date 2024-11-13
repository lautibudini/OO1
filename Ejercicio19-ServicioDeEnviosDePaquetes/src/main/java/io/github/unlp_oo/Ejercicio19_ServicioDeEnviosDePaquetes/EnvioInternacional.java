package io.github.unlp_oo.Ejercicio19_ServicioDeEnviosDePaquetes;

import java.time.LocalDate;

public class EnvioInternacional extends Envio{

	public EnvioInternacional(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double pesoEnGramos) {
		super(fechaDespacho, direccionOrigen, direccionDestino, pesoEnGramos);
	}
	
	public double calcularCosto(){
		if (this.getPesoEnGramos()<=1) {
			return 5000+(10*this.getPesoEnGramos());
		}
		return 5000+(12*this.getPesoEnGramos());
	}
	

}
