package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {

	private Persona persona;
	private Persona persona2;
	@BeforeEach
	public void setUp() throws Exception {
		
		LocalDate fechaNacimiento = LocalDate.of(2001, 5, 7);
		persona = new Persona("Juan Cruz", fechaNacimiento);
		
		LocalDate fechaNacimiento2 = LocalDate.of(1996, 5, 7);
		persona2 = new Persona("Eduardo", fechaNacimiento2);
		
		}
		@Test
		void testEdad() {
				int edad = persona.getEdad();
				assertEquals(edad, 21);
		}
		
		@Test
		void testMenorQue() {
			assertTrue(persona.menorQue(persona2));
		}
	

}
