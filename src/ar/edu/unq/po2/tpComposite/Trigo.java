package ar.edu.unq.po2.tpComposite;

public class Trigo extends Cultivo {

	@Override
	public double getGananciaAnual() {
		// TODO Auto-generated method stub
		return 300;
	}
	
	public double calcularDivGanancia() {
		return getGananciaAnual()/4;
	}
	 

}
