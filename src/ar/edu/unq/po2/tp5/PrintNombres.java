package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class PrintNombres {
	
	private List<ImprimibleNombre> nombres = new ArrayList<ImprimibleNombre>();
	
	public void agregarNombre(ImprimibleNombre unObjetoConNombre) {
		nombres.add(unObjetoConNombre);
	}
	
	public void print() {
		for(ImprimibleNombre nombre: nombres) {
			nombre.printIn();
		}
	}
	

}
