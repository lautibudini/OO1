package ar.edu.unlp.info.oo1.ejercicio4_figurasycuerpos;


class Cuadrado implements Figura{
	
	private int lado;
	
	// Metodos a implementar del UML.
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public int getLado() {
		return this.lado;
	}
	
	
	public double getPerimetro() {
		// El perimetro de un cuadrado es la suma de sus 4 lados : 
		
		return 4*this.lado;
	}
	
	
	public double getArea() {
		// Math.pow(double base, double exponent)
		// Para calcular el area del cuadrado es lado al cuadrado. 
		
		return Math.pow(this.lado, 2);
	}
	
	
	
	
	
	
}