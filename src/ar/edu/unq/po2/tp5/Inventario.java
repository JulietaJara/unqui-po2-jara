package ar.edu.unq.po2.tp5;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
	
	Map<Producto, Integer> stockDeProductos = new HashMap<Producto, Integer>(); 
	
	public void agregarProducto(Producto producto, Integer stock) {
		stockDeProductos.put(producto, stock); 
	}
	
	public void actualizarStockDe(Producto producto) {
		int nuevoStock = stockDeProductos.get(producto) - 1; 
		stockDeProductos.replace(producto, nuevoStock); 
	}
	
	public int getStock(Producto producto) {
		return stockDeProductos.get(producto); 
	}
	

}
