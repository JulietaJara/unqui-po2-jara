package ar.edu.unq.po2.tpObserver;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class PublicacionesTestCase {
	SistemaDeReferencia sistema;
	Artículo artículo; 
	Suscriptor unSuscriptor; 
	
	@Test
	void test() {
		sistema = new SistemaDeReferencia();
		List<String> pc = Arrays.asList("Java", "Programación"); 
		artículo = mock(Artículo.class); 
		unSuscriptor = mock(Suscriptor.class);
		when(unSuscriptor.getPrefrencias()).thenReturn(pc);
		when(artículo.getPalabrasClaves()).thenReturn(pc); 
		sistema.registrarSuscriptor(unSuscriptor);
		
		artículo.setPalabrasClaves(pc);
		
		
		
		sistema.agregarArtículo(artículo);
		
		//assertTrue(unSuscriptor.getPrefrencias().contains("Programación"));
		verify(unSuscriptor, times(1)).recibirNotificación();
		
	}

}
