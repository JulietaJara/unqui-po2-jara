package ar.edu.unq.po2.tp4;
import java.util.ArrayList;

public class Trabajador {
	
	ArrayList <Ingreso> ingresos = new ArrayList <Ingreso>();
	
	public void agregarIngreso(Ingreso ingreso) {
		this.ingresos.add(ingreso);
	}
	
	public int getTotalPercibido() {
		int totalPercibido = 0;
		for(Ingreso ingreso:ingresos) {
			totalPercibido = totalPercibido + ingreso.getMontoPercibido();
		}
		return totalPercibido;
		
	}
	
	public int getMontoImponible() {
		int montoImponible = 0;
		for(Ingreso ingreso:ingresos) {
			montoImponible = montoImponible + ingreso.montoImponible();
		}
		return montoImponible;
	}
	
	public double getImpuestoAPagar() {
		return (getMontoImponible() *0.2); 
	}

}
