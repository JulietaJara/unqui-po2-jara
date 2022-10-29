package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class App {
	private List<Partido> partidos = new ArrayList<Partido>();
	private List<Interesados> interesados = new ArrayList<Interesados>(); 
	
	public List<Partido> getPartidos() {
		return partidos;
	}
	
	public void agregarPartido(Partido p) {
		partidos.add(p); 
		this.enviarNotificación(p); 
		}
	
	public void enviarNotificación(Partido p) {
		for(Interesados i : interesados) {
			i.recibirNotificación(p); 
		}
	}
	
	public void agregarInteresado(Interesados i) {
		interesados.add(i); 
	}
	
	
	

}
