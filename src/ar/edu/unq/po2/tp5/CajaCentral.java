package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class CajaCentral {
	
	private List <Producto> productosDeCliente = new ArrayList <Producto>();
	
	public void agregarAlCarrito(Producto producto) {
		productosDeCliente.add(producto);
	}
	
	public double registrarProductos() {
		double montoAcumulado = 0; 
		for(Producto producto:productosDeCliente) {
			montoAcumulado = montoAcumulado + producto.getPrecio();
			producto.decrementarStock();
			
		}
		return montoAcumulado; 
		
	}
	


}
