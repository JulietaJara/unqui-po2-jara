package ar.edu.unq.po2.tpEnum;

import static org.junit.jupiter.api.Assertions.*; 
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadesSemanalesTestCase {
private ActividadesSemanales actividades;
private ActividadSemanal futbol; 
private ActividadSemanal basket; 
private ActividadSemanal basket2;
private ActividadSemanal jabalina; 
	
	@BeforeEach
	public void setUp() throws Exception{
		actividades = new ActividadesSemanales();
		futbol = new ActividadSemanal(DiaDeSemana.MARTES, "16:00", 60, Deporte.FUTBOL);
		basket = new ActividadSemanal(DiaDeSemana.MIERCOLES, "14:00", 90, Deporte.BASKET);
		basket2 = new ActividadSemanal(DiaDeSemana.JUEVES, "14:00", 90, Deporte.BASKET);
		jabalina = new ActividadSemanal(DiaDeSemana.LUNES, "09:00", 60, Deporte.JABALINA); 
		
		actividades.agregarActividad(futbol);
		actividades.agregarActividad(basket);
		actividades.agregarActividad(basket2);
		actividades.agregarActividad(jabalina);
	}

	@Test
	void testActividadesDeFutbol() {
		List<ActividadSemanal> actFutbol = actividades.actividadesDeFulbol();
		assertTrue(actFutbol.contains(futbol));
		assertEquals(actFutbol.size(), 1); 
	}
	
	@Test
	void testActividadesConComplejidad() {
		List<ActividadSemanal> actComplejidad = actividades.actividadesConComplejidad(2);
		assertEquals(actComplejidad.size(), 2); 
		
	}
	
	@Test
	void testCantDeHorasTotales() {
		int totalHoras = actividades.cantHorasTotales();
		assertEquals(totalHoras, 210);
	}

	@Test
	void testActividadDeMenorCosto() {
		ActividadSemanal act = actividades.actividadDeMenorCosto(Deporte.BASKET);
		assertEquals(act, basket);
	}
	
	@Test
	void testActividadesEconomicas() {
		Map<Deporte, List<ActividadSemanal>> actsEcon = actividades.actividadesEconomicas();
		System.out.print(actsEcon);
	}
	
	@Test 
	void testImprimirActividadSemanal() {
		futbol.printIn();
	}
	
	@Test
	void testImprimirTodasLasActividades() {
		actividades.imprimirActividades();
	}

}
