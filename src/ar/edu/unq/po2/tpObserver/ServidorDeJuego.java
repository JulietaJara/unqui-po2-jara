package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class ServidorDeJuego {
	private List<Jugador> jugadores = new ArrayList<Jugador>();
	private List<Pregunta> preguntas = new ArrayList<Pregunta>();

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public List<Pregunta> getPreguntas() {
		return preguntas;
	}
	
	public void agregarJugador(Jugador j) {
		if(jugadores.size() < 5) {
			jugadores.add(j); 
			enviarNotificacion(j);
		}
	}
	
	public void enviarNotificacion(Jugador j) {
		List<String> pregsParaJugador = preguntas.stream().map(p -> p.getPregunta()).toList(); 
		j.recibirNotificaciónYPreguntas(pregsParaJugador);
		
	}
	
	public void recibirRespuesta(Jugador j, String pregunta, String respuesta) {
		List<Pregunta> pregs = preguntas.stream().filter(p -> p.getPregunta() == pregunta).toList(); 
		if(pregs.get(0).getRespuesta() == respuesta) {
			contabilizarRespuestaCorrecta(j, pregunta);
			j.respuestaCorrecta();
			notificarRespuestaCorrectaAJugadores(pregunta, j); 
		} else {
			j.respuestaIncorrecta();
		}
	}

	private void contabilizarRespuestaCorrecta(Jugador j, String preg) {
		j.sumarRespuestaCorrecta();
		verificarFinalizaciónDePartida(j);
	}

	private void verificarFinalizaciónDePartida(Jugador j) {
		if (j.getRestCorrectas() == 5) {
			finalizarPartida();
		}
		
	}

	private void finalizarPartida() {
		for(Jugador jugador : jugadores) {
			jugador.recibirNotificacionDeFinalizaciónDePartida();
		}
		
	}

	private void notificarRespuestaCorrectaAJugadores(String pregunta, Jugador j) {
		for(Jugador jugador : jugadores) {
			jugador.recibirNotificacionDeRespuestaCorrecta(pregunta, j);
		}
		
	}

}
