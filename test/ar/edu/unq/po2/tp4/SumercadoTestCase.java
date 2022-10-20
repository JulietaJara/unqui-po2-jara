package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumercadoTestCase {
private Supermercado supermercado;
private Producto arroz;
private Producto fideos;
	@BeforeEach
	public void setUp() throws Exception{
		supermercado = new Supermercado("Carlitos", "F. Varela 116"); 
		
		arroz = new ProductoDePrimeraNecesidad("arroz", 400, false, 0.10);
		fideos = new ProductoDePrimeraNecesidad("Fideos", 200, true, 0.8);
		
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(fideos);
	}

	@Test
	void testCantTotalDeProductos() {
		int cantProducto = supermercado.cantTotalDeProductos();
		assertEquals(cantProducto, 2);
	}
	
	@Test
	void testCantDePreciosProductos() {
		double cantPrecios = supermercado.cantTotalDePrecios();
		assertEquals(cantPrecios, 200);
	}

}
