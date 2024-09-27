package io.github.unlp_oo.ejercicio9_CuentaConGanchos;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class CuentaCorrienteTest {

	
	CuentaCorriente cuenta;
	
	@BeforeEach
	void setUp() throws Exception {
		cuenta = new CuentaCorriente();
		cuenta.depositar(100);
		cuenta.setDescubierto(50);
	}	
	
	
	@Test
	public void testDepositar() {
		assertEquals(100 ,cuenta.getSaldo());
	}
	
	
	@Test
	public void testPuedeExtraer() {
		assertTrue(cuenta.puedeExtraer(140));
		assertFalse(cuenta.puedeExtraer(300));
	}
	
	
	
	
	
	
	
}
