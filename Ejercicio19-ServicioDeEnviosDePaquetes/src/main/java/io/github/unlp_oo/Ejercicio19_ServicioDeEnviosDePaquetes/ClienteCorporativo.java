package io.github.unlp_oo.Ejercicio19_ServicioDeEnviosDePaquetes;

import java.time.LocalDate;

public class ClienteCorporativo extends Cliente{
	

	private String nombre;
	private int cuit;
	
	
	public ClienteCorporativo(String direccion, String nombre, int cuit) {
		super(direccion);
		this.nombre = nombre;
		this.cuit = cuit;
	}
	
   
	public double getDescuento() {
		//No tiene descuento , retorno 1. 
		return 1;
	}
	
	
	

}
