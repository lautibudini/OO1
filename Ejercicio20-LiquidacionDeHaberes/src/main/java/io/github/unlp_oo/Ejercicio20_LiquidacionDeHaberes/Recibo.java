package io.github.unlp_oo.Ejercicio20_LiquidacionDeHaberes;

import java.time.LocalDate;

public class Recibo {
	
	private String nombre;
	private String apellido;
	private int cuil;
	private int antiguedad;
	private LocalDate fechaDeEmision;
	private double sueldoACobrar;
	
	public Recibo(String nombre, String apellido, int cuil, int antiguedad, double sueldoACobrar) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.antiguedad = antiguedad;
		this.fechaDeEmision = LocalDate.now();
		this.sueldoACobrar = sueldoACobrar;
	}

	@Override
	public String toString() {
		return "Recibo [nombre=" + nombre + ", apellido=" + apellido + ", cuil=" + cuil + ", antiguedad=" + antiguedad
				+ ", fechaDeEmision=" + fechaDeEmision + ", sueldoACobrar=" + sueldoACobrar + "]";
	}
	
	
	
	
	
	

}
