package ar.edu.unlp.info.oo1.ejercicio3_presupuestos;
import java.time.LocalDate;
import java.util.List;
import java.util.LinkedList;

class Presupuesto {
	
	private java.time.LocalDate fecha;
	private String cliente;
	private List<Item> listaItems;
	
	// Metodo constructor.
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.listaItems = new LinkedList<Item>();
	}
	
	
	// Metodos a desarrollar en el UML.
	public void agregarItem(Item item){
		//Aca agrego a una lista donde estan todos los items.
		this.listaItems.add(item);
	}
	
	public double calcularTotal(){
		// Recorro la lista y calculo el total de los items.
		double tot = 0;
		for(Item it : this.listaItems) {
			tot += it.costo();
		}
		return tot;
	}
	
	
	
	
	// Metodos agregados.
	
	public java.time.LocalDate getFecha(){
		return this.fecha;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	
	
	
	
	
	
}