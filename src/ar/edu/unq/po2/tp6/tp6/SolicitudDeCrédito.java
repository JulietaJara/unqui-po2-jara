package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCrédito {
	private Cliente cliente;
	private double montoSolicitado;
	private int plazoDeMeses;
	private String estadoDeSolicitud; 

	public SolicitudDeCrédito(Cliente cliente, double monto, int plazoDeMeses) {
		this.cliente = cliente;
		this.montoSolicitado = monto;
		this.plazoDeMeses = plazoDeMeses;
		this.estadoDeSolicitud = "Procesada";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public void setMontoSolicitado(double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}

	public int getPlazoDeMeses() {
		return plazoDeMeses;
	}

	public void setPlazoDeMeses(int plazoDeMeses) {
		this.plazoDeMeses = plazoDeMeses;
	}
	
	public double getCuotaMensual() {
		return montoSolicitado/plazoDeMeses; 
	}
	
	public String getEstadoDeSolicitud() {
		return estadoDeSolicitud;
	}

	public void setEstadoDeSolicitud(String estadoDeSolicitud) {
		this.estadoDeSolicitud = estadoDeSolicitud;
	}
	
	public abstract boolean isCumpleConRequisitos(); 

}
