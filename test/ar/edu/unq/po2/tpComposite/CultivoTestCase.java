package ar.edu.unq.po2.tpComposite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CultivoTestCase {
	Cultivo trigo;
	Cultivo soja; 
	Cultivo cultivoMixto;
	Cultivo cultivoMixto2;
	
	
	@BeforeEach
	public void setUp() throws Exception{
		trigo = new Trigo();
		soja = new Soja(); 
		cultivoMixto2 = new Mixta(trigo, trigo, trigo, soja); 
		cultivoMixto = new Mixta(trigo, soja, trigo, cultivoMixto2);
	}
	

	@Test
	void testCultivoPuroDeSojaTieneUnaUnaGananciaAnualDe500pesos() {
		double amount = trigo.getGananciaAnual();
		assertEquals(300, amount); 
	}
	
	@Test
	void testCultivoPuroDeTrigoTieneUnaGananciaAnualDe300pesos() {
		double amount = soja.getGananciaAnual();
		assertEquals(500, amount); 
	}
	
	@Test
	void testCultivoMixtoTieneGananciaAnualPorSubdivision() {
		double amount = cultivoMixto2.getGananciaAnual();
		assertEquals(350, amount); 
	}
	
	@Test
	void testCultivoMixtoConMásDeUnaComposiciónGananciaAnual() {
		double amount = cultivoMixto.getGananciaAnual();
		assertEquals(625, amount); 
	}

}
