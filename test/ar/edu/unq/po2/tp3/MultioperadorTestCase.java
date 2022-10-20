package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
private Multioperador multioperador;
	@BeforeEach
	public void setUp() throws Exception {
	
	multioperador = new Multioperador();
	
	multioperador.addNumber(1);
	multioperador.addNumber(4);
	multioperador.addNumber(2);
	multioperador.addNumber(3);
	
	}
	
	@Test
	void testSumar() {
		int amount = multioperador.sumar();
		assertEquals(amount, 10);
	}
	
	@Test
	void testMult() {
		int amount = multioperador.mult();
		assertEquals(amount, 24);
	}
	
	@Test
	void testRestar() {
		int amount = multioperador.restar();
		assertEquals(amount, -10);
	}

}
