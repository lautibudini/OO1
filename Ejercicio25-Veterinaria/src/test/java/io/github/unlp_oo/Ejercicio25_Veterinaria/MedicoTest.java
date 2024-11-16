package io.github.unlp_oo.Ejercicio25_Veterinaria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;


public class MedicoTest {
	
	Medico medico;
	ConsultaMedica consulta;
	Vacunacion vacunacion;
	Mascota mascota;
	
	
	@BeforeEach
	void setUp() throws Exception{
		medico = new Medico("Juan",LocalDate.of(2022, 10, 1),100);
		mascota = new Mascota("Rober",LocalDate.now(),"Caniche");
	}
	
	@Test
    public void testGetAntiguedad() {
		assertEquals(2,medico.getAntiguedad());
	}
	
	@Test 
	public void darDeAltaConsulta() {
		ConsultaMedica res = medico.darDeAltaConsulta(mascota);
		assertNotEquals(res,null);
	}
	
	@Test 
	public void darDeAltaVacunacion() {
		Vacunacion resV = medico.darDeAltaVacunacion(mascota,"X",150);
		assertNotEquals(resV,null);
	}
}
