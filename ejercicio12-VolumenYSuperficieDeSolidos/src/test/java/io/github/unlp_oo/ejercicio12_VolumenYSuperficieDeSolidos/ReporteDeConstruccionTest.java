package io.github.unlp_oo.ejercicio12_VolumenYSuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {

	ReporteDeConstruccion reporte;
	Cilindro cilindro;
	Esfera esfera;
	PrismaRectangular prisma;
	
    private void initialize() {
        reporte = new ReporteDeConstruccion();
        cilindro = new Cilindro("Hierro","Rojo",10,20);
        esfera = new Esfera("Hierro","Azul",8);
        prisma = new PrismaRectangular("Metal","Azul",10,5,30);
    }
    
    @BeforeEach
    public void setUp() {
        this.initialize();
    }
    
    @Test
    public void testInicial() {
    	assertEquals(6283,Math.round(cilindro.getVolumen()));
    	assertEquals(1885,Math.round(cilindro.getSuperficie()));
    	assertEquals(2145,Math.round(esfera.getVolumen()));
    	assertEquals(804,Math.round(esfera.getSuperficie()));
    	assertEquals(1500,prisma.getVolumen());
    	assertEquals(1000,prisma.getSuperficie());
    	
    }
    
    @Test
    void testReportes() {
    	reporte.agregarPieza(cilindro); 
    	reporte.agregarPieza(esfera);
    	reporte.agregarPieza(prisma);
    	assertEquals(8428,Math.round(reporte.getVolumenDeMaterial("Hierro")));
    	assertEquals(1500,reporte.getVolumenDeMaterial("Metal"));
    	assertEquals(1885,Math.round(reporte.getSuperficieDeColor("Rojo")));
    	assertEquals(1804,Math.round(reporte.getSuperficieDeColor("Azul")));
    }
	
	
}
