package ar.edu.unq.po2.tpObserver;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTestCase {
App app;
AppUsuario usuario;
Servidor servidor; 
Partido partido; 

	@BeforeEach
	public void setUp() throws Exception{
		app = new App();
		usuario = mock(AppUsuario.class);
		
		List<String> deportesDeInteres = Arrays.asList("Tenis");
		when(usuario.getDeportesDeInterés()).thenReturn(deportesDeInteres);
		servidor = mock(Servidor.class);
		
		List<String> deportes = Arrays.asList("Fultbol", "Tenis"); 
		when(servidor.getDeportesDeInteres()).thenReturn(deportes); 
		
		partido = mock(Partido.class); 
		when(partido.getDeporte()).thenReturn("Futbol"); 
		List<String> contricantes = Arrays.asList("Enzo Peréz", "Armani", "Alvaréz", "Messi");
		when(partido.getContricantes()).thenReturn(contricantes);
		
		app.agregarInteresado(servidor);
		app.agregarInteresado(usuario);
	}

	@Test
	void testIngresaUnNuevoPartidoYLaAppLeAvisaASusInteresados() {
		app.agregarPartido(partido);
		
		verify(servidor, times(1)).recibirNotificación(partido);
	}

}
