package ar.edu.unq.po2.tp4;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;

public class Trabajador {
	
	private List <Ingreso> ingresos = new ArrayList <Ingreso>();
=======

public class Trabajador {
	
	ArrayList <Ingreso> ingresos = new ArrayList <Ingreso>();
>>>>>>> 34b690944f9c4af76927824dc22f1b6fc71a089c
	
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
