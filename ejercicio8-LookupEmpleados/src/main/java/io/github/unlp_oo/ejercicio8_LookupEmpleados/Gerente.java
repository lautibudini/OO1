package io.github.unlp_oo.ejercicio8_LookupEmpleados;

public class Gerente extends Empleado{

	
	public Gerente(String nombre) {
		super(nombre);
	}
	
	
	public double montoBasico() {
		return 57000;
	}
	
	public double aportes() {
		return this.montoBasico() * 0.05d;
	}
	
}
