package io.github.unlp_oo.ejercicio10_ElInversor;


import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {

	Inversor inversora;
	InversionEnAcciones acciones;
	PlazoFijo plazoFijoV;
	
	@BeforeEach
	void setUp() throws Exception {
		 inversora = new Inversor("Chechu");
		 acciones = new InversionEnAcciones("Accion Hospital", 500, 3);
		 plazoFijoV = new PlazoFijo(LocalDate.of(2024, 9, 20), 10.0, 20.0);	 
	}
	
	@Test
	public void testAcciones() {
		assertEquals(1500,acciones.valorActual());
	}
	
	
	//Al momento de hacer el test hay 7 dias de dif. 
	@Test
	public void testPlazoFijo() {
		assertEquals(1410,plazoFijoV.valorActual());
	}
	
	@Test
	public void testInversor() {
		assertEquals(0,inversora.valorActual());
		inversora.agregarInversion(acciones);
		assertEquals(1500,inversora.valorActual());
		inversora.agregarInversion(plazoFijoV);
		assertEquals(2910,inversora.valorActual());
	}
	
	
	
}
