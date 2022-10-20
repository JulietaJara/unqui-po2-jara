package ar.edu.unq.po2.tpComposite;

public class Soja implements Cultivo {
	
	@Override
	public double getGananciaAnual() {
		// TODO Auto-generated method stub
		return 500;
	}
	
	public double calcularDivGanancia() {
		return getGananciaAnual()/4;
	}
	

}
