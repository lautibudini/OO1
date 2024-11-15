package io.github.unlp_oo.ejercicio23_MercadoDeObjetos;

public class RetiroExpressDomicilio implements Envio {

	@Override
	public double getCostoEnvio(String dirVendedor, String dirCliente) {
		//return Clase.distanciaEntre(dirVendedor,dirCliente)
		return 100;
	}
	
	

}
