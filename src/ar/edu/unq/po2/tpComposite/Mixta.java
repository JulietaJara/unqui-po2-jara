package ar.edu.unq.po2.tpComposite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mixta extends Cultivo{
	private List<Cultivo> cultivos = new ArrayList<Cultivo>(); 
	
	public Mixta(Cultivo cul1, Cultivo cul2, Cultivo cul3, Cultivo cul4) {
		cultivos = Arrays.asList(cul1, cul2, cul3, cul4); 
	}
	
	public List<Cultivo> getDivisiones() {
		return cultivos;
	}


	@Override
	public double getGananciaAnual() {
		double gananciaAnual = 0; 
		for(Cultivo cult : cultivos) {
			gananciaAnual += this.calcularGanancia(cult); 
			
		}
		return gananciaAnual;
	}
	
	public double calcularDivGanancia() {
		return getGananciaAnual(); 
	}
	
	public double calcularGanancia(Cultivo cult) {
		double ganancia = 0; 
		ganancia = cult.calcularDivGanancia(); 
		return ganancia; 
	}
	
	

}
