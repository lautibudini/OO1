package io.github.unlp_oo.ejercicio6_GenealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero {

	private String especie;
	private String identificador;
	private LocalDate fechaNacimiento;
	private Mamifero padre,madre;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String identificador) {
		this.identificador = identificador;

	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Mamifero getPadre() {
	  return this.padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return this.madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.madre != null) {
			  return this.madre.getMadre();
			}
		return null;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.madre != null) {
		  return this.madre.getPadre();
		}
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.madre != null) {
		  return this.padre.getMadre();
		}
		return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.madre != null) {
		  return this.padre.getPadre();
		}
		return null;
	}
	
	
	public boolean tieneComoAncestroA(Mamifero mamifero) {
		boolean posee = false;
		if (this.padre == mamifero || this.madre == mamifero) {
			posee = true;
		}else {
			if (this.getMadre() != null) {
				posee = this.getMadre().tieneComoAncestroA(mamifero);
			}
			if (!posee && (this.getPadre() != null)) {
				posee = this.getPadre().tieneComoAncestroA(mamifero);
			}
		}
		return posee;
	}
	
	
	
	
	
}
