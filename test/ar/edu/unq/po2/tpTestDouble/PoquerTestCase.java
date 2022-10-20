package ar.edu.unq.po2.tpTestDouble;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PoquerTestCase {
private PockerStatus poquer;
private List<String> cartas; 
private List<String> cartas2; 

   @BeforeEach
   public void setUp() throws Exception{
	 poquer = new PockerStatus(); 
	 cartas = Arrays.asList("10P", "10D", "2T", "10C", "10D"); 
	 cartas2 = Arrays.asList("10P", "4D", "2T", "10C", "1D"); 
}

	@Test
	void testCuandoCuatroCartasOMasSonIgualesEsPoquer() {
		boolean isPoquer = poquer.isPoquer(cartas); //Exercise
		assertTrue(isPoquer); //Verify
	}
	
	@Test
	void testCuandoMenosDeCuatroCartasSonIgualesNoEsPoquer() {
		boolean isPoquer = poquer.isPoquer(cartas2); //Exercise
		assertFalse(isPoquer); //Verify
	}
	
	@Test
	void testCuandoEsPoquerTambienEsTrio() {
		String poquerString = poquer.verificar("10P", "10D", "2T", "10C", "10D");
		assertEquals("Poquer  Trio", poquerString); 
	}
	
	@Test
	void testCuandoLasCartasSonDelMismoPaloIsColor() {
		String palo = poquer.verificar("2T", "10T", "6T", "10T", "4T");
		assertEquals(" Color ", palo); 
	}
	
	@Test
	void testCuando3CartasSonIgualesEsTrio() {
		String trio = poquer.verificar("2T", "10D", "2T", "10T", "2T");
		assertEquals("  Trio", trio);
	}
	
	@Test
	void testCuandoNoHayNingunaIgualdadNoEsNada() {
		String nadita = poquer.verificar("2D", "10D", "4T", "KT", "JT");
		assertEquals("Nada", nadita);
	}
	
	

}
