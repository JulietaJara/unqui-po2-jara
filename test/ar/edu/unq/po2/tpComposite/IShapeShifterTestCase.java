package ar.edu.unq.po2.tpComposite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IShapeShifterTestCase {
	IShapeShinfter a; 
	IShapeShinfter b; 
	IShapeShinfter c; 
	IShapeShinfter d; 
	
	@BeforeEach
	public void setUp() throws Exception{
		a = new IShapeShinfter();
		b = new IShapeShinfter();
		c = a.compose(b);
		d = new IShapeShinfter();
		
		
	}

	@Test
	void testUnIShapeShinterContieneAOtroIShapeShinfer() {
		IShapeShinfter c = a.compose(b);  
		
		assertTrue(c.getComposiciones().contains(a)); 
		assertTrue(c.getComposiciones().contains(b));
	}
	
	@Test
	void testUnIShapeShinterContieneAOtroIShapeShinferQueASuVezContieneAOtroIShape() {
		IShapeShinfter e = d.compose(c); 
		
		assertTrue(e.getComposiciones().contains(c)); 
		assertFalse(e.getComposiciones().contains(a)); 
		
	}
	
	@Test
	void testCantidadDeComposicionesDeUnIShapeShinfter() {
		IShapeShinfter nuevoD = d.compose(c);
		
		assertEquals(4, nuevoD.deepest());
		
	}
	
	@Test
	void testAchacarIShapeShinfter() {
		IShapeShinfter f = d.compose(c); 
		IShapeShinfter fAchacado = f.flat(); 
		
		assertTrue(fAchacado.getComposiciones().contains(a));
		
		
	}
	
	@Test
	void testListaDeIShapeShinfter() {
		IShapeShinfter f = d.compose(c);
		int cant = f.values().size();
		
		assertEquals(4, cant);
	}

}
