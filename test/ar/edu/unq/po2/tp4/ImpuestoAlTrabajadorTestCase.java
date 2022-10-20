package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoAlTrabajadorTestCase {
private Trabajador trabajador;
private Ingreso ingreso;
private Ingreso ingreso2;

@BeforeEach
public void setUp() throws Exception{
	trabajador = new Trabajador(); 
	
	ingreso =  new IngresoBasico("Septiembre", "concepto", 40000);
	ingreso2 = new IngresoPorHorasExtras("Noviembre", "concepto2", 60000, 4);
	
	trabajador.agregarIngreso(ingreso);;
	trabajador.agregarIngreso(ingreso2);
}

	@Test
	void testTotalPercibido() {
		int amount = trabajador.getTotalPercibido();
		assertEquals(amount, 100000);
	}
	
	@Test
	void testTotalImponible() {
		int amount = trabajador.getMontoImponible();
		assertEquals(amount, 40000);
	}
	
	@Test
	void testTotalImpuesto() {
		double amount = trabajador.getImpuestoAPagar();
		assertEquals(amount, 8000);
	}

}
