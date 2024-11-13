package io.github.unlp_oo.Ejercicio19_ServicioDeEnviosDePaquetes;

import java.time.LocalDate;

public class PersonaFisica extends Cliente{
	
	private String nombre;
	private int dni;
	
	
	public PersonaFisica(String direccion, String nombre, int dni) {
		super(direccion);
		this.nombre = nombre;
		this.dni = dni;
	}


    public double getDescuento() {
    	return 0.9;
    }
	
}
