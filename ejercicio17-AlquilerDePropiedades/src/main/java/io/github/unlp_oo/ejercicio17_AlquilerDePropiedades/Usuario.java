package io.github.unlp_oo.ejercicio17_AlquilerDePropiedades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import io.github.unlp_oo.ejercicio14_IntervaloDeTiempo.DateLapse;

public class Usuario {
	
	private String nombre;
	private int dni;
	private String direccion;
	private List<Propiedad> propiedades;
	
	public  Usuario(String nombre, int dni , String direccion) {
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.propiedades = new ArrayList<Propiedad>();
	}

	public void agregarPropiedad(Propiedad lugar) {
		this.propiedades.add(lugar);
	}
	
	public double calcularIngresos(LocalDate inicio, LocalDate fin) {
		/*Lo que hace es recorrer la lista de propiedades del usuario , donde
		  por cada propiedad llama a un metodo que le devuelve la ganancia del usuario
		  en las reservas de un periodo pasado como parametro. Por ultimo suma todo.
		 
		 */
		return this.propiedades.stream()
				.mapToDouble(propiedades -> propiedades.gananciaEnPeriodo(inicio, fin)).sum()*0.75;
	}

}
