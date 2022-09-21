package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	
	private double costoUnidadConsumida;
	private double cantUnidadesConsumidas;
	
	public Servicio(double costoUnidad, double cantUnidades) {
		this.costoUnidadConsumida = costoUnidad;
		this.cantUnidadesConsumidas = cantUnidades;
	}
	
	public double getCostoUnidadConsumida() {
		return costoUnidadConsumida;
	}
	
	public void setCostoUnidadConsumida(double costoUnidadConsumida) {
		this.costoUnidadConsumida = costoUnidadConsumida;
	}
	
	public double getCantUnidadesConsumidas() {
		return cantUnidadesConsumidas;
	}
	
	public void setCantUnidadesConsumidas(double cantUnidadesConsumidas) {
		this.cantUnidadesConsumidas = cantUnidadesConsumidas;
	}
	
	public double montoAPagar() {
		return costoUnidadConsumida*cantUnidadesConsumidas; 
	}
	
    public void registrarPago() {
		
	}

}
