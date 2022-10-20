package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	ArrayList<Integer> counter = new ArrayList<Integer>();
	
	public void addNumber(int unNumero) {
		counter.add(unNumero);
	}
	
	public  Integer getEvenOcurrences() {
		int numerosParesContados = 0;
		for (int numero:counter) {
			if ((numero%2) == 0){
				numerosParesContados ++; 
				
			}
		}
		return numerosParesContados; 
		
	}
	
	public int getOdd() {
		int numerosImparesContados = 0;
		for(int numero:counter) {
			if((numero%2) == 1) {
				numerosImparesContados ++;
			}
		}
		return numerosImparesContados;
	}
	
	public Integer multiplesOf(int unNumero) {
		int multiplosContados = 0;
		for(int numero:counter){
			if((unNumero%numero) == 0) {
				multiplosContados ++;
			}
		}
		return multiplosContados;
	}

}
