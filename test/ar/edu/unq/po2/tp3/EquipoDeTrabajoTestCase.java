package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	private EquipoDeTrabajo equipo;
	private PersonaDeEquipo persona;
	private PersonaDeEquipo persona2;
	private PersonaDeEquipo persona3;
	private PersonaDeEquipo persona4;
	private PersonaDeEquipo persona5;
	
	@BeforeEach
	public void setUp() throws Exception {
	
	equipo = new EquipoDeTrabajo();
	persona = new PersonaDeEquipo("Eduardo", "Salvador", 48);
	persona2 = new PersonaDeEquipo("Juan Cruz", "Salvador", 8);
	persona3 = new PersonaDeEquipo("Julieta", "Jara", 22);
	persona4 = new PersonaDeEquipo("Dani", "Bebe", 26);
	persona5 = new PersonaDeEquipo("Julian", "Alvarez", 30);
	
	equipo.addPersona(persona);
	equipo.addPersona(persona2);
	equipo.addPersona(persona3);
	equipo.addPersona(persona4);
	equipo.addPersona(persona5);
	
	}

	@Test
	void testPromedio() {
		float prom = equipo.promedioDeEdades();
		assertEquals(prom, 26);
	}

}
