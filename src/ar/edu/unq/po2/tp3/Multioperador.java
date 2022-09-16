package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	ArrayList<Integer> multioperador = new ArrayList<Integer>();
	
	public void addNumber(int unNumero) {
		multioperador.add(unNumero);
	}
	
	public int sumar() {
		int suma = 0;
		for(int numero:multioperador) {
			suma = suma + numero;
		}
		return suma;
	}
	
	public int restar() {
		int resta = 0;
		for(int numero:multioperador) {
			resta = resta - numero;
		}
		return resta;
	}
	
	public int mult() {
		int mult = 1;
		for(int numero:multioperador) {
			mult = mult*numero;
		}
		return mult;
	}

}
