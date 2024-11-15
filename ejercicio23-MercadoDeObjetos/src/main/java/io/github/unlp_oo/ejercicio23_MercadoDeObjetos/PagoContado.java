package io.github.unlp_oo.ejercicio23_MercadoDeObjetos;

public class PagoContado implements Pago {

	@Override
	public double getCostoFinal(double precio) {
		return precio; 
	}

}
