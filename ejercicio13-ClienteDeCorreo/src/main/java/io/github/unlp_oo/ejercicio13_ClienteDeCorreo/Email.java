package io.github.unlp_oo.ejercicio13_ClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Email {

	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	
	public Email(String titulo, String cuerpo, List<Archivo> adjuntos) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>(adjuntos);
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public List<Archivo> getAdjuntos(){
		//Le paso una copia.
		return new ArrayList<Archivo>(this.adjuntos);
	}
	
	public boolean contiene(String texto) {
		return (this.titulo.contains(texto) || this.cuerpo.contains(texto));
	}
	
	public double getEspacio() {
		return this.titulo.length() + this.cuerpo.length() + this.getLongArchivos();
	}
	
	
	private double getLongArchivos() {
		return this.adjuntos.stream().mapToDouble(archivo -> archivo.tamaño()).sum();
	}
	
	
}
