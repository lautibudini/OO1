package io.github.unlp_oo.ejercicio8_LookupEmpleados;

public class EmpleadoJerarquico extends Empleado{

	public EmpleadoJerarquico(String nombre) {
		super(nombre);
	}
	
	
	public double bonoPorCategoria() {
		return 8000;
	}
	
	public double montoBasico() {
		return 45000;
	}
	
	public double sueldoBasico(){
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	
	
	
	
	
}
