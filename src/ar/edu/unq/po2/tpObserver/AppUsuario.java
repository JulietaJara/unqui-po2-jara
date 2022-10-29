package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class AppUsuario implements Interesados {
	private List<String> deportesDeInterés = new ArrayList<String>();
	private List<String> contricantesDeInterés = new ArrayList<String>(); 

	public List<String> getDeportesDeInterés() {
		return deportesDeInterés;
	}
	
	public List<String> getContricantesDeInterés(){
		return contricantesDeInterés; 
	}

	@Override
	public void recibirNotificación(Partido p) {
		if (esDeInteres(p)) {
			System.out.print("Nueva notificación de intereses");
		} else {
			System.out.print("No se encuentran notificaciones de intereses");
		}
		
	}

	@Override
	public boolean esDeInteres(Partido p) {
		// TODO Auto-generated method stub
		return deportesDeInterés.contains(p.getDeporte()) || contricantesDeInterés.containsAll(p.getContricantes()); 
	} 

	
}
