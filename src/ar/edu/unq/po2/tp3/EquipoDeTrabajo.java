package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private String nombre;
	ArrayList <PersonaDeEquipo> equipoDeTrabajo = new ArrayList <PersonaDeEquipo>();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addPersona(PersonaDeEquipo unaPersona) {
		equipoDeTrabajo.add(unaPersona); 
	}
	
	public float promedioDeEdades() {
		int prom = 0;
		for (PersonaDeEquipo persona: equipoDeTrabajo) {
			prom = prom + persona.getEdad();
		}
		prom = prom / equipoDeTrabajo.size();
		return prom; 
	}
	
	

}
