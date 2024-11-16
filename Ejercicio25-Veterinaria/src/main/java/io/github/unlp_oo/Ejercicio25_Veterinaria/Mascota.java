package io.github.unlp_oo.Ejercicio25_Veterinaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
	
	private String nombre;
	private LocalDate fechaNacimiento;
	private String especie;
	
	//DEBO USAR UNA LISTA PARA LOS SERVICIOS.
	private List<Servicio> serviciosPasados;
    
	
	
	public Mascota(String nombre, LocalDate fechaNacimiento, String especie) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.especie = especie;
		this.serviciosPasados = new ArrayList<Servicio>();
	}
	
	
	public void añadirServicio(Servicio servicio) {
		this.serviciosPasados.add(servicio);
	}
	
	
	public ServicioGuarderia darDeAltaSetvicioGuarderia(int cantDias) {
		ServicioGuarderia servicio = new ServicioGuarderia(this,LocalDate.now(),cantDias);
		this.añadirServicio(servicio);
		return servicio;
	}
	
	
	public ConsultaMedica darDeAltaConsulta(Medico medico) {
		ConsultaMedica consulta = new ConsultaMedica(this,LocalDate.now(),medico);
		this.añadirServicio(consulta);
		return consulta;
	}
	
	
	public Vacunacion darDeAltaVacunacion(Medico medico, String nombreVacuna, double costo) {
		Vacunacion vacunacion = new Vacunacion(this,LocalDate.now(),medico,nombreVacuna,costo);
		this.añadirServicio(vacunacion);
		return vacunacion;
	}
	
	
	public int getCantServicios() {
		return this.serviciosPasados.size();
	}
	
	public double determinarRecaudacion(LocalDate fechaDeterminada) {
		return this.serviciosPasados.stream()
				.filter(IntervencionMedica -> IntervencionMedica.getFechaServicio().isEqual(fechaDeterminada) )
				.mapToDouble(IntervencionMedica -> 
		IntervencionMedica.calcularCostoServico()).sum();
	}
}