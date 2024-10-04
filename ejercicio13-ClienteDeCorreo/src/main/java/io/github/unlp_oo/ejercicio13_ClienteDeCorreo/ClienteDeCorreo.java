package io.github.unlp_oo.ejercicio13_ClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {

	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo(Carpeta inbox) {
		this.inbox = new Carpeta("inbox");
		this.carpetas = new ArrayList<Carpeta>();
	}
	
	
	public void recibir(Email email){
		this.inbox.agregarMail(email);
	}
	
	
	public Email buscar(String texto) {
		//Map lo que hace es castear a lo que devuelve o algo asi.
		//Falta inbox.
		return this.carpetas.stream().map(carpeta -> carpeta.buscarMail(texto)).findFirst().orElse(null);
	}
	
	public double espacioOcupado() {
	   return this.carpetas.stream().mapToDouble(carpeta -> carpeta.getValorEmails()).sum();
	
	}
}
