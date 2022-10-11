package ar.edu.unq.po2.tp6;

public class PropiedadInmobiliaria {
	private String descripción; 
	private String dirección;
	private double valorFiscal; 
	
	public PropiedadInmobiliaria(String descripción, String dirección, double valorFiscal) {
		this.descripción = descripción;
		this.dirección = dirección;
		this.valorFiscal = valorFiscal;
		
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}

	public void setValorFiscal(double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}

}
