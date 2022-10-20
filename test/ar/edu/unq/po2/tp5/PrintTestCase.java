package ar.edu.unq.po2.tp5;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrintTestCase {
	
	private PrintNombres print;
	private Persona eduardo;
	private Mascota lola;
		
		@BeforeEach
		public void setUp() throws Exception{
				print = new PrintNombres(); 
				
				LocalDate fechaDeNacimiento = LocalDate.now();
				eduardo = new Persona("Eduardo", fechaDeNacimiento);
				lola = new Mascota("Lola", "Mixta");
				
				print.agregarNombre(eduardo);
				print.agregarNombre(lola);
			}


	@Test
	void testImprimir() {
		print.print();
	}

}
