package io.github.unlp_oo.ejercicio23_MercadoDeObjetos;

public class Pago6Cuotas implements Pago{

	@Override
	public double getCostoFinal(double precio) {
		return precio + (precio*0.20);
	}

}
