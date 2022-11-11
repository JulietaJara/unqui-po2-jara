package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class ServidorDeJuego {
	private List<Jugador> jugadores = new ArrayList<Jugador>();
	private List<Pregunta> preguntas = new ArrayList<Pregunta>();
	
	public ServidorDeJuego(List <Pregunta> pregs) {
		preguntas = pregs; 
	}

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
		if(!pregs.isEmpty() && pregs.get(0).isRespuestaCorrecta(respuesta)) { 
			j.respuestaCorrecta(pregunta);
			verificarFinalizaciónDePartida(j);
			notificarRespuestaCorrectaAJugadores(pregunta, j); 
		} else {
			j.respuestaIncorrecta(pregunta);
		}
	}

	
	private void verificarFinalizaciónDePartida(Jugador j) {
		if (j.getContabilizador().getRestCorrectas() == 5) {
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
