package ar.edu.unq.po2.tpEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ActividadesSemanales {
	private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
	
	public void agregarActividad(ActividadSemanal actividad) {
		actividades.add(actividad); 
	}
	
	public List<ActividadSemanal> actividadesDeFulbol(){
		List<ActividadSemanal> actividadesFutbol = actividades.stream().filter(f -> f.getDeporte() == Deporte.FUTBOL).toList(); 
		return actividadesFutbol; 
	}
	
	public List<ActividadSemanal> actividadesConComplejidad (int unaComplejidad){
		List<ActividadSemanal> actividadesConComplejidad = actividades.stream().filter(f -> f.getDeporte().getComplejidad() == unaComplejidad).toList(); 
		return actividadesConComplejidad;
	}
	
	public int cantHorasTotales() {
		List <Integer> duracionDeActividades = actividades.stream().map(s -> s.getDuración()).toList(); 
		int cant = duracionDeActividades.stream().reduce(0, (acumulado, nuevo) -> acumulado + nuevo); 
		return cant; 
	}
	
	public ActividadSemanal actividadDeMenorCosto(Deporte unDeporte) {
		List<ActividadSemanal> actividadesDeDeporte = actividades.stream().filter(d -> d.getDeporte() == unDeporte).toList(); 
		Optional<ActividadSemanal> actConMenorCosto = actividadesDeDeporte.stream().min(Comparator.comparing(ActividadSemanal:: getPrecioFinal)); 
		return actConMenorCosto.get(); 
	}
	
	
	
	public Map<Deporte, List<ActividadSemanal>> actividadesEconomicas(){
		Map<Deporte, List<ActividadSemanal>> actividadesEconomicas = actividades.stream().collect(Collectors.groupingBy(ActividadSemanal :: getDeporte));
		
		
		return actividadesEconomicas; 
	}
	
	public void imprimirActividades() {
		for(ActividadSemanal act:actividades) {
			act.printIn();
		}
	}
	
	

}
