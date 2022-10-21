package ar.edu.unq.po2.tpComposite;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FyleSystemTestCase {
Archivo archivo;
Archivo archivo2; 
Directorio directorio;
Directorio directorio2; 

@BeforeEach
public void setUp() throws Exception{
	LocalDate fecha = LocalDate.now();
	archivo = new Archivo("Documents", 44, fecha, fecha);
	archivo2 = new Archivo("DiscoC", 100, fecha, fecha); 
	directorio = new Directorio("Favoritos", fecha);
	directorio2 = new Directorio("DiscoLocal", fecha); 
	
	directorio.agregarFyle(archivo2);
	directorio.agregarFyle(directorio2);
	directorio2.agregarFyle(archivo);
}

	@Test
	void testArchivoTieneBytesDeEspacio() {
		int bytes = archivo.totalSize();
		assertEquals(44, bytes); 
	}
	
	@Test
	void testDirectorioTieneCantidadDeBytesDeEspacio() {
		int bytesTotal = directorio.totalSize();
		assertEquals(144, bytesTotal); 
	}
	
	@Test
	void imprimirInformaciónDeArchivo() {
		archivo.printStructure(); 
	}
	
	@Test
	void imprimirInformaciónDeContenidoDeDirectorio() {
		directorio.printStructure();
	}
	
	@Test
	void testFyleMasNuevo() {
		FyleSystem elemNuevo = directorio.lastModified();
		assertEquals(archivo, elemNuevo);
	}
	
	@Test
	void testFyleMasViejo() {
		FyleSystem oldNom = directorio.oldestElement();
		assertEquals(archivo, oldNom);
	}

}
