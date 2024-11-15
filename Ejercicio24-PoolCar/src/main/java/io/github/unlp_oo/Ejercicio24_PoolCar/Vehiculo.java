package io.github.unlp_oo.Ejercicio24_PoolCar;

import java.time.LocalDate;

public class Vehiculo {
	
	private Conductor dueño;
	private String descripcion;
    private int cantPasajeros;
    private LocalDate fechaFabricacion;
    private double valorDeMercado;
    
    public Vehiculo( String descripcion, int cantPasajeros, 
    		LocalDate fechaFabricacion, double valorDeMercado) {
    	
    	this.dueño = null;
    	this.descripcion = descripcion;
    	this.cantPasajeros = cantPasajeros;
    	this.fechaFabricacion = fechaFabricacion;
    	this.valorDeMercado = valorDeMercado;
    }
    
    protected void setDueño(Conductor conductor) {
    	this.dueño = conductor;
    }
    
    public LocalDate getFechaDeFabricacion() {
    	return this.fechaFabricacion;
    }
	
    public int getCantPasajerosMax() {
    	return this.cantPasajeros;
    }
    
    public double getValorMercado() {
    	return this.valorDeMercado;
    }
	
}
