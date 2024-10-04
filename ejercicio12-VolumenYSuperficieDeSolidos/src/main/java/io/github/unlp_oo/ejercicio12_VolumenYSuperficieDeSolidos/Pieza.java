package io.github.unlp_oo.ejercicio12_VolumenYSuperficieDeSolidos;

public abstract class Pieza {

	private String material;
	private String color;
	
	public Pieza(String material, String color) {
		this.color = color;
		this.material = material;
		}
	
	public String getMaterial() {
		return this.material;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public abstract double getVolumen();
	
	public abstract double getSuperficie(); 
}
