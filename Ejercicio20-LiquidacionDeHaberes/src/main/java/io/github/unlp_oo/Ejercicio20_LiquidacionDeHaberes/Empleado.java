package io.github.unlp_oo.Ejercicio20_LiquidacionDeHaberes;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private int cuil;
	private LocalDate fechaNacimiento;
	private boolean tieneHijos;
	private List<Contrato> contratos;
	private Contrato contratoActivo;
	private List<Recibo> recibos;
	
	
	public Empleado(String nombre, String apellido, int cuil, LocalDate fechaNacimiento, boolean tieneHijos,
			Contrato contratoActivo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.fechaNacimiento = fechaNacimiento;
		this.tieneHijos = tieneHijos;
		this.contratoActivo = contratoActivo;
		this.contratos = new LinkedList<Contrato>();
	}
	
	
	public void setContratoActico(Contrato contrato) {
		this.contratoActivo = contrato;
	}
	
	public int calcularAntiguedad() {
		/* la antigüedad de un empleado se calcula como la suma
           de las duraciones de cada uno de los contratos registrados
       */
		return (int) this.contratos.stream().mapToDouble(Contrato -> Contrato.duracion()).sum();
	}
	
	
	public Recibo generarRecibo(){
		int Antiguedad = this.calcularAntiguedad();
		double ACobrar = contratoActivo.valorAntiguedad(Antiguedad);
		Recibo nuevo = new Recibo(this.nombre, this.apellido,this.cuil,Antiguedad,ACobrar);
		return nuevo;
	}
	
	
	
	

}
