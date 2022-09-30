package ar.edu.unq.po2.tp5;

public class ProductoTradicional extends Producto {
	
	public ProductoTradicional(String nombre, double precio, boolean precioCuidado) {
		super(nombre, precio, precioCuidado);
	}
	
	public double getPrecio() {
		return precio; 
	}

}
