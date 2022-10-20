package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {
	
	private int horasExtras;
	
	public IngresoPorHorasExtras(String unMes, String unConcepto, int unMontoPercibido,int unaCantidadDeHorasExtras) {
		this.mesDePercepción = unMes;
		this.concepto = unConcepto;
		this.montoPercibido = unMontoPercibido;
		this.horasExtras = unaCantidadDeHorasExtras;
		
	}
	
	public int getHorasExtras() {
		return horasExtras;
	}

	public int montoImponible() {
		return 0;
	}

}
