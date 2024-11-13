package io.github.unlp_oo.Ejercicio19_ServicioDeEnviosDePaquetes;

import java.time.LocalDate;

public class EnvioLocal extends Envio {

	private boolean envioRapido;
	
	public EnvioLocal(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double pesoEnGramos, boolean envioRapido) {
		super(fechaDespacho, direccionOrigen, direccionDestino, pesoEnGramos);
		this.envioRapido = envioRapido;
	}
	
	public double calcularCosto() {
		if (envioRapido) {
			return 1500;
		}
		return 1000;
	}

}
