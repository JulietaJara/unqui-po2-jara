package ar.edu.unq.po2.tp6;

public class SolicitudDeCrÃ©ditoPersonal extends SolicitudDeCrÃ©dito {
	
	public SolicitudDeCrÃ©ditoPersonal(Cliente cliente, double monto, int plazoDeMeses) {
		super(cliente, monto, plazoDeMeses); 
	}
	
public boolean isCumpleConRequisitos() {
	double ingresosAnuales = getCliente().getSueldoNeto()*12;  
	double porcentajeDeIngresosMensuales = (getCliente().getSueldoNeto()*70)/100;
		return ingresosAnuales >= 15000 & getCuotaMensual() < porcentajeDeIngresosMensuales; 
 	}

}
