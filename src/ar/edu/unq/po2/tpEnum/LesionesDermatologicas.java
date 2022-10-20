package ar.edu.unq.po2.tpEnum;

import java.util.Arrays;
import java.util.List;

public enum LesionesDermatologicas {
	ROJO("rojizo", 1), GRIS("grisaceo", 2), AMARILLO("amarillento", 2), MIEL ("clarito", 1);
	
	private String descripción; 
	private int nivelDeRiesgo; 
	
	LesionesDermatologicas(String descripción, int nivelDeRiesgo) {

		this.descripción = descripción;
		this.nivelDeRiesgo = nivelDeRiesgo;
		
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public void setNivelDeRiesgo(int nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}
	
	public LesionesDermatologicas getSiguienteLesion(LesionesDermatologicas lesion) {
		List <LesionesDermatologicas> lesiones = Arrays.asList(LesionesDermatologicas.values()); 
		int i = lesion.ordinal() + 1; 
		LesionesDermatologicas siguienteLesión; 
		if(i < lesiones.size()) {
			siguienteLesión = lesiones.get(i);
			
		} else {
			siguienteLesión = lesiones.get(0); 
		}
		return siguienteLesión; 
	}
	

	

}

