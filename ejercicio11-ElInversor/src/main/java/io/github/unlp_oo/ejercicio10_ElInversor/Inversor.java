package io.github.unlp_oo.ejercicio10_ElInversor;

import java.util.List;
import java.util.ArrayList;



public class Inversor {

	private String nombre;
	private List<Inversiones> inversiones;
	
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversiones>();
	}
	
	
	public void agregarInversion(Inversiones inversion) {
		this.inversiones.add(inversion);
	}
	
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(Inversiones -> Inversiones.valorActual()).sum();
	
	}
	
	
	
}
