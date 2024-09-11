package ar.edu.unlp.info.oo1.ejercicio4_figurasycuerpos;

class Circulo implements Figura{
	
	private double radio;
	
	
	// Metos a implementar en el UML.
	
	public double getDiametro(){
		return this.radio*2;
	}
	
	public void setDiametro(double diametro) {
		// Al cambiar el diametro del circulo cambia su radio : 
		this.radio = (diametro/2);
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	// Metodos de la Interfaz. 
	
	public double getPerimetro() {
		return Math.PI*this.getDiametro();
	}
	
	public double getArea() {
		//Math.pow(double base, double exponent)
		return Math.PI*(Math.pow(this.radio, 2));
	}
	
	
	
	

	
}