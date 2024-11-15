package io.github.unlp_oo.ejercicio23_MercadoDeObjetos;

public class RetiroEnSucursalDeCorreo implements Envio {

	@Override
	public double getCostoEnvio(String dirVendedor, String dirCliente) {
		return 3000;
	}
	
	

}
