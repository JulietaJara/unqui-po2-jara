package ar.edu.unq.po2.tp4;

public class ProductoBásico extends Producto {
	
	public ProductoBásico (String nombre, double precio, boolean precioCuidado) {
		super(nombre, precio, precioCuidado);
	}
	
	public double getPrecio() {
		return precio; 
	}

}
