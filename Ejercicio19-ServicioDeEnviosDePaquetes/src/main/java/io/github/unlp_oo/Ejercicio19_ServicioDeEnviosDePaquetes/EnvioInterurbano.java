package io.github.unlp_oo.Ejercicio19_ServicioDeEnviosDePaquetes;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio {

	private double distanciaKM;
	
	public EnvioInterurbano(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino,double pesoEnGramos, double distanciaKM) {
		super(fechaDespacho, direccionOrigen, direccionDestino, pesoEnGramos);
		this.distanciaKM = distanciaKM;
	}
	
	
	public double calcularCosto() {
		double costo = 0;
		if (this.distanciaKM < 100) {
			costo = 20*this.getPesoEnGramos();
		}else {
			if (this.distanciaKM < 500) {
				costo = 25*this.getPesoEnGramos();
			}else {
				costo = 30*this.getPesoEnGramos();
			}
		}
		return costo;
	}
	

}
