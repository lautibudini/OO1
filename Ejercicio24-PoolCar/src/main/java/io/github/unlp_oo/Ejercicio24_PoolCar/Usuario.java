package io.github.unlp_oo.Ejercicio24_PoolCar;

public abstract class Usuario{

	private String nombre;
	private double saldo;
	
	public Usuario(String nombre, double saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
    public abstract void cargarSaldo(double monto);
	
	public abstract void procesarMontoViaje(double monto);
	
	protected double getSaldo() {
		return this.saldo;
	}
	
	protected void setSaldo(double monto) {
		this.saldo = monto;
	}
	
	
}
