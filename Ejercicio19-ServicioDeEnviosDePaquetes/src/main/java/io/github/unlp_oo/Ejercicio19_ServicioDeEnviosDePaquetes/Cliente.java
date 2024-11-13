package io.github.unlp_oo.Ejercicio19_ServicioDeEnviosDePaquetes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	 
	private String direccion;
	private List<Envio>envios;
	
	public Cliente(String direccion) {
		this.direccion = direccion;
		this.envios = new ArrayList<Envio>();
	}
	
	public void agregarEnvio(Envio envio) {
		this.envios.add(envio);
	}
	
    
	
	public double montoAPagarEnPeriodo(LocalDate Inicio, LocalDate Fin) {
    	
    	return this.envios.stream().filter(envios ->envios.estaEntre(Inicio, Fin))
    			.mapToDouble(envios -> envios.calcularCosto()*this.getDescuento()).sum();
    }
    
    
    public abstract double getDescuento(); 
   
	
}
