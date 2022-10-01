package ar.edu.unq.po2.tp5;

public class Servicio  implements Cobrable, Factura {
	private Agencia agencia; 
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
	
    public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	@Override
	public double cobrar() {
		return costoUnidadConsumida*cantUnidadesConsumidas; 
	}

	@Override
	public void registrarPago() {
		// TODO Auto-generated method stub
		agencia.registrarPago(this);
	}

}
