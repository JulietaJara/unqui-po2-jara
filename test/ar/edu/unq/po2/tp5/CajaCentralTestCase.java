package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaCentralTestCase {
private CajaCentral caja;
private Producto leche;
private Producto fideos;
private Inventario inventario; 
private Servicio servicio; 
	
	@BeforeEach
	public void setUp() throws Exception{
			caja = new CajaCentral(); 
			inventario = new Inventario();
			
			leche = new ProductoCooperativa("Leche", 400, false, inventario, 0.4);
			fideos = new ProductoTradicional("Fideos", 200, true, inventario);
			
			inventario.agregarProducto(fideos, 40);
			inventario.agregarProducto(leche, 60);
			
			servicio = new Servicio(2, 1000); 
			
		}

	@Test
	void testRegistrarProductos() {
		double amount = caja.registrarPago(fideos); 
		amount = caja.registrarPago(leche);	
		assertEquals(amount, 360);
	}
	
	@Test
	void testRegistrarServicio() {
		double amount = caja.registrarPago(servicio);
		assertEquals(amount, 2000);
	}
	
}
