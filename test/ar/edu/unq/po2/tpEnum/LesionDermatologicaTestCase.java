package ar.edu.unq.po2.tpEnum;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class LesionDermatologicaTestCase {

public static void main(String [] args) {
	new LesionDermatologicaTestCase().test();
	new LesionDermatologicaTestCase().testGetSiguiente(); 
	
	
}

private int getOrden(LesionesDermatologicas lesion) {
	return lesion.ordinal();
	
}

public LesionesDermatologicas getSiguienteLesion(LesionesDermatologicas lesion) {
	List <LesionesDermatologicas> lesiones = Arrays.asList(LesionesDermatologicas.values()); 
	int i = lesion.ordinal() + 1; 
	LesionesDermatologicas siguienteLesión; 
	if(i < lesiones.size()) {
		siguienteLesión = lesiones.get(i);
		
	} else {
		siguienteLesión = lesiones.get(0); 
	}
	return siguienteLesión; 
}


	@Test
	public void test() {
		System.out.print(this.getOrden(LesionesDermatologicas.ROJO)); 
		
	}
	
	@Test
	public void testGetSiguiente() {
		System.out.print(this.getSiguienteLesion(LesionesDermatologicas.MIEL));
	}


}
