package io.github.unlp_oo.ejercicio9_CuentaConGanchos;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;




public class CajaDeAhorroTest {

	
    CajaDeAhorro caja;
	
	@BeforeEach
	void setUp() throws Exception {
		caja = new CajaDeAhorro();
		caja.depositar(100);
	}
	
	@Test
	public void testDepositar() {
		assertEquals(98 ,caja.getSaldo());
	}
	
	@Test
	public void testPuedeExtraer() {
		assertTrue(caja.puedeExtraer(3));
		assertFalse(caja.puedeExtraer(300));
	}
	
	
	@Test
	public void testTransferirCuenta() {
		CuentaCorriente cuenta = new CuentaCorriente();
		
		
		assertTrue(caja.transferirACuenta(50, cuenta));
		assertTrue(cuenta.puedeExtraer(50));
		cuenta.setDescubierto(20);
		assertFalse(cuenta.puedeExtraer(120));
	}
}
