package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class Partido {
	private String resultado;
	private String deporte; 
	private List<String> contricantes = new ArrayList<String>();
	
	public String getDeporte() {
		return deporte;
	}
	
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
	public String getResultado() {
		return resultado;
	}
	
	public List<String> getContricantes() {
		return contricantes;
	} 

}
