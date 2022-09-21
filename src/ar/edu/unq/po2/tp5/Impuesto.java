package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	
	private double tasaDeServicio;
	
	public Impuesto(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}

	public double getTasaDeServicio() {
		return tasaDeServicio;
	}

	public void setTasaDeServicio(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}
	
	public double montoAPagar() {
		return tasaDeServicio; 
	}
	
	public void registrarPago() {
		
	}

}
