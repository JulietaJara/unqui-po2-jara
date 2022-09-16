package ar.edu.unq.po2.tp4;

public class IngresoBasico extends Ingreso {
	
	public IngresoBasico(String unMes, String unConcepto, int unMontoPercibido) {
		this.mesDePercepción = unMes;
		this.concepto = unConcepto;
		this.montoPercibido = unMontoPercibido;
	}
	
	@Override
	public int montoImponible() {
		int montoImponible = montoPercibido;
		return montoImponible;
	}

}
