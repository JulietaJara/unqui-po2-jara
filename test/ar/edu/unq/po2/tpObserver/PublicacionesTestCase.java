package ar.edu.unq.po2.tpObserver;

import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PublicacionesTestCase {
	SistemaDeReferencia sistema;
	Artículo artículo; 
	Suscriptor unSuscriptor; 
	
	@BeforeEach
	public void setUp() throws Exception{
		sistema = new SistemaDeReferencia();
		
		artículo = mock(Artículo.class); 
		unSuscriptor = mock(Suscriptor.class);
		
		sistema.registrarSuscriptor(unSuscriptor);
	}
	@Test
	void testUnSistemaEnviaNotificaciónASuscriptores() {
		List<String> pc = Arrays.asList("Java", "Programación"); 
		
		when(unSuscriptor.getPrefrencias()).thenReturn(pc);
		when(artículo.getPalabrasClaves()).thenReturn(pc);
		
		sistema.agregarArtículo(artículo);
		
		verify(unSuscriptor, times(1)).recibirNotificación();
		
	}

}
