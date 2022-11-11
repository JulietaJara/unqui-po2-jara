package ar.edu.unq.po2.tpObserver;

import java.util.List;

public class Jugador {
	private String nombre;
	private Contabilizador contabilizador;
	
	public Jugador(String nombre, Contabilizador contabilizador) {
		this.nombre = nombre;
		this.contabilizador = contabilizador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Contabilizador getContabilizador() {
		return contabilizador;
	}

	public void setContabilizador(Contabilizador contabilizador) {
		this.contabilizador = contabilizador;
	}
	
	public void respuestaCorrecta(String pregunta) {
		contabilizador.sumarRespuestaCorrecta(pregunta);
		System.out.print("Respuesta correcta " + pregunta);
	}
	
	public void respuestaIncorrecta(String pregunta) {
		System.out.print("Respuesta Incorrecta de " + pregunta);
	}

	public void recibirNotificaciónYPreguntas(List<String> pregsParaJugador) {
		System.out.print("Fuiste aceptado en la partida");
		contabilizador.recibirPreguntas(pregsParaJugador);
		
	}

	public void recibirNotificacionDeFinalizaciónDePartida() {
		System.out.print("La partida esta finalizada");
		
	}

	public void recibirNotificacionDeRespuestaCorrecta(String pregunta, Jugador j) {
		System.out.print("Respuesta correcta de " + pregunta + "del jugador: " + j.getNombre());
		
	}

}
