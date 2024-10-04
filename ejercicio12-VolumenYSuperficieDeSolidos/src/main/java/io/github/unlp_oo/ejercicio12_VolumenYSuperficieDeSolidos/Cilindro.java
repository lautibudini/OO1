package io.github.unlp_oo.ejercicio12_VolumenYSuperficieDeSolidos;

public class Cilindro extends Pieza{

	private int radio;
	private int altura;
	
	public Cilindro(String material, String color, int radio, int altura) {
		super(material, color);
		this.altura = altura;
		this.radio = radio;
	}
	
	public double getVolumen() {
		return Math.PI*(Math.pow(this.radio, 2))*this.altura;
	}
	
	public double getSuperficie() {
		return 2*Math.PI*this.radio*this.altura + 2*Math.PI*Math.pow(this.radio, 2);
	}

	
}
