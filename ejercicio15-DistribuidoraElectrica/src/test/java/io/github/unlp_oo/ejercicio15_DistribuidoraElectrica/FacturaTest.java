package io.github.unlp_oo.ejercicio15_DistribuidoraElectrica;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public interface FacturaTest {

	Persona chechu,sol;
	CuadroTarifario tarifa;
	
	@BeforeEach
	void setUp() throws Exception {
		tarifa = new CuadroTarifario(20);
		chechu = new Persona("Chechu","La plata 13");
		sol = new Persona("solci","La plata 50");
		
		chechu.agregarConsumo(new Consumo(200,30));
		sol.agregarConsumo(new Consumo(300,0));
	}
	
	@Test
	public void FacturaTest() {
		
		Factura solF = sol.emitirFactura(tarifa);
		Factura chehcuF = chechu.emitirFactura(tarifa);
		
		//Aca debo corroborar que haga bien los calculos y ver si la tarifa cambia
		// que no cambien los datos.
		
	}
	
	
}
