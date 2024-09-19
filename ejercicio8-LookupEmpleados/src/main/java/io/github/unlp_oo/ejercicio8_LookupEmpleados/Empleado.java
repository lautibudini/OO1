package io.github.unlp_oo.ejercicio8_LookupEmpleados;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Empleado {

	private String nombre;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
    public double aportes() {
    	return 13500;
    }
    
    public double montoBasico() {
    	return 35000;
    }

    
    public double sueldoBasico() {
    	return this.montoBasico() + this.aportes();
    }
    
    
    
    
    
}
