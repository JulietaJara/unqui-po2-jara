package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeReferencia {
	
	private List<Artículo> artículos = new ArrayList<Artículo>(); 
	private List<Suscriptor> suscriptores = new ArrayList<Suscriptor>(); 
	
	public void agregarArtículo(Artículo art) {
		artículos.add(art); 
		this.enviarNotificación(art);
	}

	public List<Artículo> getArtículos() {
		return artículos;
	}

	public List<Suscriptor> getSuscriptores() {
		return suscriptores;
	}
	
	public void registrarSuscriptor(Suscriptor s) {
		suscriptores.add(s); 
	}
	
	public void eliminarSuscriptor(Suscriptor s) {
		suscriptores.remove(s); 
	}
	
	public void enviarNotificación(Artículo art) {
		for(Suscriptor s : suscriptores) {
			this.enviarNotificaciónSiCorresponde(s, art);
		}
	}
	
	public void enviarNotificaciónSiCorresponde(Suscriptor s, Artículo a) {
		List<String> p = a.getPalabrasClaves();
		while(!p.isEmpty() & !s.getPrefrencias().contains(p.get(0))) {
			p.remove(0); 
		}
		if(!p.isEmpty()) {
			s.recibirNotificación();
		}
	}
	
	
}
