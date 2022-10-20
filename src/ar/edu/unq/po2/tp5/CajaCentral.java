package ar.edu.unq.po2.tp5;


public class CajaCentral {

	public double registrarPago(Cobrable cobrable) {
		double montoAcumulado = 0; 
		montoAcumulado += cobrable.cobrar(); 
			
		return montoAcumulado; 
		
	}
	


}
