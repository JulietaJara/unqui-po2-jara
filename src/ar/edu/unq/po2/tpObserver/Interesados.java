package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public interface Interesados {
	List<String> intereses = new ArrayList<String>();
	
	public void recibirNotificación(Partido p);
	
	public boolean esDeInteres(Partido p); 

}
