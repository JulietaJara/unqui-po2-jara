package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements Interesados{
	
	private List<String> deportesDeInteres = new ArrayList<String>();

	public List<String> getDeportesDeInteres() {
		return deportesDeInteres;
	}
	
	public void agregarDeporteDeInteres(String d) {
		deportesDeInteres.add(d); 
	}

	public void recibirNotificación(Partido p) {
		if(this.esDeInteres(p)) {
			System.out.print("Nueva notificación");
		} else {
			System.out.print("No hay partidos de interes");
		}
		
	}
	
	public boolean esDeInteres(Partido p) {
		return deportesDeInteres.contains(p.getDeporte()); 
	}

}
