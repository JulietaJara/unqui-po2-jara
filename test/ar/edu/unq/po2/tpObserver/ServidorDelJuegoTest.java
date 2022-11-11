package ar.edu.unq.po2.tpObserver;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServidorDelJuegoTest {
	Jugador jugador;
	Contabilizador contabilizador;
	ServidorDeJuego servidor;
	Pregunta pregunta1;
	Pregunta pregunta2;

	@BeforeEach
	public void setUp() throws Exception {
		pregunta1 = new Pregunta("¿Cuantos hermanos son los weasley?", "7");
		pregunta2 = new Pregunta("¿Cuantos libros son de Harry Potter", "7");

		List<Pregunta> pregs = Arrays.asList(pregunta1, pregunta2);
		servidor = new ServidorDeJuego(pregs);
		contabilizador = new Contabilizador();
		jugador = new Jugador("Peluche", contabilizador);

		servidor.agregarJugador(jugador);
	}

	@Test
	void testUnJugadorRespondeMalAUnaPregunta() {
		servidor.recibirRespuesta(jugador, "¿Cuantos hermanos son los weasley?", "8");

		int cantRespuestas = jugador.getContabilizador().getRestCorrectas();

		assertEquals(0, cantRespuestas);
	}
	
	@Test
	void testUnJugadorRepondeBienAUnaPregunta() {
		servidor.recibirRespuesta(jugador, "¿Cuantos hermanos son los weasley?", "7");

		int cantRespuestas = contabilizador.getRestCorrectas();
		
		assertEquals(1, cantRespuestas);
	}

}
