package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTestCase {
	private Banco banco; 
	private Cliente cliente1; 
	private Cliente cliente2; 
	private SolicitudDeCrédito solicitud1; 
	private SolicitudDeCrédito solicitud2; 
	private SolicitudDeCrédito solicitud3; 
	private PropiedadInmobiliaria propiedad; 
	
	@BeforeEach
	public void setUp() throws Exception{
		banco = new Banco(); 
		cliente1 = new Cliente("Alberto", "Cruz", "calle 140 44", 40, 20000);
		cliente2 = new Cliente("Julieta", "Jara", "calle 22", 20, 200000);
		propiedad = new PropiedadInmobiliaria("casa prefabricada", "calle 44 88", 4000000); 
		solicitud1 = new SolicitudDeCréditoPersonal(cliente1, 200000, 10);
		solicitud2 = new SolicitudDeCréditoPersonal(cliente2, 50000, 12); 
		solicitud3 = new SolicitudCréditoHipotecario(cliente2, 100000, 24, propiedad); 
		
		banco.agregarSolicitud(solicitud1);
		banco.agregarSolicitud(solicitud2);
		banco.agregarSolicitud(solicitud3);
		
		banco.evaluarSolicitudes();
	}
	
	@Test
	void testBancoTieneSolicitudDeCrédito() {
		assertTrue(banco.solicitudes.contains(solicitud1));
	}
	
	@Test
	void testCantDeSolicitudesAceptadas() {
		int cantDeAceptadas = banco.getSolicitudesAceptadas().size();
		assertEquals(cantDeAceptadas, 2);
	}
	
	@Test
	void testCantDeSolicitudesRechazadas() {
		int cantDeAceptadas = banco.getSolicitudesRechazadas().size();
		assertEquals(cantDeAceptadas, 1);
	}
	
	@Test
	void testMontoADesembolsar() {
		double monto = banco.montoTotalADesembolsar();
		assertEquals(150000, monto);
	}

}
