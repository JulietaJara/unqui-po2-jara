package ar.edu.unq.po2.tpTestDouble;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.Arrays;
import java.util.List;

public class PockerStatus {
	
	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		List <String> cartas = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
		if (isPoquerTrioOColor(cartas)) {
			return verificarPoquer(cartas) + " "+ verificarPalo(cartas) +" " + verificarTrio(cartas); 
		}
		return "Nada"; 
		
	}
	
	public boolean isPoquerTrioOColor(List<String> cartas) {
		return isPoquer(cartas) | isTrio(cartas) | isColor(cartas); 
	}
	
	public String verificarTrio(List<String> cartas) {
		if(isTrio(cartas)) {
			return "Trio";
		} else {
			return "";
		}
	}
	
	public boolean isTrio(List<String> cartas) {
		int cantContada = 0;
		for (String carta: cartas) {
			if(this.isEqualsNum(carta, cartas.get(0))) {
				cantContada ++; 
			}
			
		}
		return cantContada >= 3;
	}
	
	public String verificarPalo(List<String> cartas) {
		if(isColor(cartas)) {
			return "Color";
		} else {
			return ""; 
		}
	}
	
	public boolean isColor(List<String> cartas) {
		int cantDePaloIgual = 0; 
		for(String carta: cartas) {
			if(isMismoPalo(carta, cartas.get(0))) {
				cantDePaloIgual ++;  
			} 
		}
		return cantDePaloIgual == 5; 
			
	}
	
	public boolean isMismoPalo(String carta1, String carta2) { //arreglar, esta comparando cualquier cosa
		return carta1.charAt(carta1.length()-1) == carta2.charAt(carta2.length() - 1); 
	}
	
	
	
	public String verificarPoquer(List<String> cartas) {
		if (isPoquer(cartas)) {
			return "Poquer"; 
		} else {
			return "";
		}
	}
	
	//Ejercicio1
	public boolean isPoquer(List<String> cartas) {
		int cantContada = 0;
		for (String carta: cartas) {
			if(this.isEqualsNum(carta, cartas.get(0))) {
				cantContada ++; 
			}
			
		}
		return cantContada >= 4; 
		
		
	}
	
	public boolean isEqualsNum(String carta1, String carta2) {
		if(carta1.length() == 2 & carta2.length() == 2) {
			return isNumberEquals(carta1, carta2, 0); 
		} else {
			return isNumberEquals(carta1, carta2, 0) & isNumberEquals(carta1, carta2, 1);
		}
	}
	
	public boolean isNumberEquals(String carta1, String carta2, int numChar) {
		return carta1.charAt(numChar) == carta2.charAt(numChar); 
	}

	
}




