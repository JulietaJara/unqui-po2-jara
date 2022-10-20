package ar.edu.unq.po2.tpComposite;

public abstract class Cultivo {
	private double gananciaAnual;
	
	public void setGananciaAnual(double gananciaAnual) {
		this.gananciaAnual = gananciaAnual;
	}

	public abstract double getGananciaAnual(); 
	
	public abstract double calcularDivGanancia(); 
		

}
