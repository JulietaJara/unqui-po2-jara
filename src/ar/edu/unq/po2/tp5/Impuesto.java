package ar.edu.unq.po2.tp5;

public class Impuesto implements Cobrable, Factura{
	private Agencia agencia; 
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
	
	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public double cobrar() {
		return tasaDeServicio; 
	}

	@Override
	public void registrarPago() {
		// TODO Auto-generated method stub
		agencia.registrarPago(this); 
	}

}
