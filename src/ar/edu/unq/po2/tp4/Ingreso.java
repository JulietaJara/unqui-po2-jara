package ar.edu.unq.po2.tp4;


public abstract class Ingreso {
	protected String mesDePercepción;
	protected String concepto;
	protected int montoPercibido;
	
	protected abstract int montoImponible();

	public String getMesDePercepción() {
		return mesDePercepción;
	}

	public String getConcepto() {
		return concepto;
	}

	public int getMontoPercibido() {
		return montoPercibido;
	}


}
