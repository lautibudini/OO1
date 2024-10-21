package io.github.unlp_oo.ejercicio15_DistribuidoraElectrica;

public class Consumo {

	private double energiaActiva;
	private double energiaReactiva;
	
	
	public Consumo(double eActiva, double eReactiva) {
		this.energiaActiva = eActiva;
		this.energiaReactiva = eReactiva;
	}
	
	
	public double calcularCostoEnergia(double tarifa){
		return this.energiaActiva * tarifa ;
	}
	
	public boolean tieneBonificacion(){
		double energias = Math.pow(this.energiaActiva, 2) + Math.pow(this.energiaReactiva, 2);
		double fpe = (this.energiaActiva) / Math.sqrt(energias);
		if (fpe > 0.8) {
			return true;
		}
		return false;
	}
	
	
	
	
	
}
