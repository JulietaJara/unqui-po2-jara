package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	List<SolicitudDeCrédito> solicitudes = new ArrayList<SolicitudDeCrédito>(); 
	
	public void agregarSolicitud(SolicitudDeCrédito solicitud) {
		solicitudes.add(solicitud); 
	}
	
	public void evaluarSolicitudes() {
		for(SolicitudDeCrédito solicitud : solicitudes) {
			if(solicitud.isCumpleConRequisitos()) {
				solicitud.setEstadoDeSolicitud("Aceptada");		
				
			} else {
				solicitud.setEstadoDeSolicitud("Rechazada");
			}
		}
		
	}
	
	public List <SolicitudDeCrédito> getSolicitudesAceptadas() {
		List <SolicitudDeCrédito> solicitudesAceptadas = solicitudes.stream().filter(s -> s.getEstadoDeSolicitud() == "Aceptada").toList();
		return solicitudesAceptadas;
	}
	
	public List <SolicitudDeCrédito> getSolicitudesRechazadas() {
		List <SolicitudDeCrédito> solicitudesRechazadas = solicitudes.stream().filter(s -> s.getEstadoDeSolicitud() == "Rechazada").toList();
		return solicitudesRechazadas;
	}
	
	public Double montoTotalADesembolsar() {
		double montoAcumulado = 0; 
		for(SolicitudDeCrédito solicitud : getSolicitudesAceptadas()) {
			montoAcumulado += solicitud.getMontoSolicitado();
		}
		
		return montoAcumulado; 
	}
	

}
