package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiploTestCase {
private Multiplos multiplo;

@BeforeEach
public void setUp() throws Exception {

multiplo = new Multiplos();
multiplo.setX(9);
multiplo.setY(3);
}
	@Test
	void testMultiploMayor() {
		int amount = multiplo.multiploMayor();
		assertEquals(amount, 999);
	}

}
