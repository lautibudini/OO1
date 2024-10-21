package io.github.unlp_oo.ejercicio15_DistribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	
	public Persona(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.consumos = new ArrayList<Consumo>();
	}
	
	
	public void agregarConsumo(Consumo consumo) {
		this.consumos.add(consumo);
	}
	
	public Factura emitirFactura(CuadroTarifario tarifa){
		Consumo consumo = this.consumos.getLast();
		double montoFinal = consumo.calcularCostoEnergia(tarifa.getPrecioKWh());
		double bonificacion = 0;
		if (consumo.tieneBonificacion()) {
			bonificacion = montoFinal * 0.10;
		}
		return new Factura(this,bonificacion,montoFinal-bonificacion);
	}
	
	

}
