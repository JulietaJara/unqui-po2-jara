package ar.edu.unq.po2.Cartas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartasTestCase {
private Carta carta;
private Carta carta2;

@BeforeEach
public void setUp() throws Exception{
	carta = new Carta(4, "Bastos");
	carta2 = new Carta(10, "Espadas"); 
}
	@Test
	void testUnaCartaSeConoceSuNumero() {
		int num = carta.getNúmero();
		assertEquals(4, num); 
	}
	
	@Test
	void testUnaCartaSeConoceSuPalo() {
		String palo = carta.getPalo();
		assertEquals("Bastos", palo); 
	}
	
	@Test
	void testEsMayorQue() {
		boolean cartaMayor = carta2.isMayor(carta);
		assertTrue(cartaMayor); 
	}
	
	@Test
	 void testEsMismoPalo() {
		boolean paloEquals = carta.isPaloEquals(carta2);
		assertFalse(paloEquals); 
	}

}
