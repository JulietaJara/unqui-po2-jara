package ar.edu.unq.po2.tp5;

public class Impuesto implements Cobrable, Agencia, Factura{
	
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
	
	public double cobrar() {
		return tasaDeServicio; 
	}

	@Override
	public void registrarPago(Factura factura) {
		// TODO Auto-generated method stub
		
	}

}
