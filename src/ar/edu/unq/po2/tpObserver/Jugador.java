package ar.edu.unq.po2.tpObserver;

import java.util.List;

public class Jugador {
	private String nombre;
	private int restCorrectas;

	public int getRestCorrectas() {
		return restCorrectas;
	}

	public void setRestCorrectas(int restCorrectas) {
		this.restCorrectas = restCorrectas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void recibirNotificaciónYPreguntas(List<String> pregsParaJugador) {
		System.out.print("Estas en juego");

	}

	public void respuestaCorrecta() {
		System.out.print("Tu respuesta es correcta");

	}

	public void recibirNotificacionDeRespuestaCorrecta(String pregunta, Jugador j) {
		System.out.print("Respuesta correcta para pregunta " + pregunta + "del jugador: " + j.getNombre());

	}

	public void respuestaIncorrecta() {
		System.out.print("Respuesta incorrecta");

	}

	public void recibirNotificacionDeFinalizaciónDePartida() {
		System.out.print("Finalizó la partida");

	}

	public void sumarRespuestaCorrecta() {
		restCorrectas ++;
		
	}

}
