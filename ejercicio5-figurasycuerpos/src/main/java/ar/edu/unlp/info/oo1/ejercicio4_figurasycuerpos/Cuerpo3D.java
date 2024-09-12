package ar.edu.unlp.info.oo1.ejercicio4_figurasycuerpos;

class Cuerpo3D{
	
	private double altura;
	private Figura cara;
	
	// Metodos implementados del UML.
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	
	public void setCaraBasal(Figura cara){ //Al ser de tipo interfaz Figura puede usarse circulo y cuadrado.
		this.cara = cara;
	}
	
	
	
	// Cara basal al momento de darle un valor sera de tipo Cuadrado o Circulo donde los dos 
   // Poseen los metodos compartidos y por eso hacemos uso de la interfaz.
	
	
	public double getVolumen() {
		
		return this.cara.getArea()*this.altura;
	}
	
	public double getSuperficieExterior() {
		return (2*this.cara.getArea()) + (this.cara.getPerimetro()*this.altura);
	}
	
	
	
}