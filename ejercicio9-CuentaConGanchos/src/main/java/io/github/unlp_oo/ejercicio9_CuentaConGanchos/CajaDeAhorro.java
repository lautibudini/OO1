package io.github.unlp_oo.ejercicio9_CuentaConGanchos;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro() {
		super();
	}
	    
	@Override
	protected boolean puedeExtraer(double monto) {
		return this.getSaldo()>=monto + (monto*0.02);
	}
	
	
	public void depositar(double monto) {
		super.depositar(monto - (monto*0.02));
	}
	
	public boolean extraer(double monto) {
		return super.extraer(monto + (monto*0.02));
		
	}
	
	public boolean transferirACuenta(double monto , Cuenta cuentaDestino) {
		return super.transferirACuenta(monto + (monto*0.02), cuentaDestino);
		
	}
	

	
}
