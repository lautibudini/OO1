package io.github.unlp_oo.ejercicio12_VolumenYSuperficieDeSolidos;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	
	private List<Pieza> piezas;
	

	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}


	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}	
	
	public double getVolumenDeMaterial(String nombre) {
		return this.piezas.stream().filter(Pieza -> Pieza.getMaterial().equals(nombre)).mapToDouble(Pieza::getVolumen).sum();
	}

	public double getSuperficieDeColor(String color) {
		return this.piezas.stream().filter(Pieza -> Pieza.getColor().equals(color)).mapToDouble(Pieza::getSuperficie).sum();
	}
	
}
