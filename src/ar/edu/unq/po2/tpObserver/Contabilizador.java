package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class Contabilizador {
	private int restCorrectas;
	private List<String> pregs = new ArrayList<String>();

	public int getRestCorrectas() {
		return restCorrectas;
	}

	public void setRestCorrectas(int restCorrectas) {
		this.restCorrectas = restCorrectas;
	}

	public List<String> getPregs() {
		return pregs;
	}

	public void recibirPreguntas(List<String> pregsParaJugador) {
		pregs = pregsParaJugador;

	}

	public void sumarRespuestaCorrecta(String pregunta) {
		restCorrectas ++;
		

	}

}
