package io.github.unlp_oo.ejercicio13_ClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {

	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Email> getEmails(){
		return new ArrayList<Email>(this.emails);
	}
	
	public void mover(Email email, Carpeta destino) {
		this.emails.remove(email);
	    destino.agregarMail(email);

	}
	
	public void agregarMail(Email mail) {
		this.emails.add(mail);
	}
	
	
	public Email buscarMail(String texto) {
		//Como busca en emails me filtra los q me den true, y saca el primero
		return this.emails.stream().filter(Emails -> Emails.contiene(texto)).findFirst()
				.orElse(null);
	}
	
	

	public double getValorEmails() {
		return this.emails.stream().mapToDouble(email -> email.getEspacio()).sum();
	}
	
	
	
}
