package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class Suscriptor {
	
	private List<String> preferencias = new ArrayList<String>();
	
	public Suscriptor(List<String> prefs) {
		this.preferencias = prefs; 
	}
	
	public List<String> getPrefrencias() {
		return preferencias;
	} 
	
	public void agregarPreferencia(String pref) {
		this.preferencias.add(pref);
	}

	public void recibirNotificación() {
		System.out.print("Nueva publicación sobre tus preferencias");
		
	}

}
