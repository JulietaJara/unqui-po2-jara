package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {

	private Rectangulo rectangulo;
	@BeforeEach
	public void setUp() throws Exception {

		rectangulo = new Rectangulo();
		rectangulo.create(2, 4);
		
		}
		@Test
		void testArea() {
				int amount = rectangulo.area();
				assertEquals(amount, 8);
			}
		
		@Test
		void testPerimetro() {
			int amount  = rectangulo.perimetro();
			assertEquals(amount, 12);
		}
		
		@Test
		void testIsVertical() {
			boolean rec = rectangulo.isVertical();
			assertTrue(rec);
			
		}
		
		@Test
		void testIsHorizontal() {
			boolean rec = rectangulo.isHorizontal();
			assertFalse(rec);
			
		}
}
