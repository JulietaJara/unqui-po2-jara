package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {
	
	private double descuentoIVA;
	
	public ProductoCooperativa(String nombre, double precio, boolean precioCuidado, Inventario stock, double descuento) {
		super(nombre, precio, precioCuidado, stock);
		this.descuentoIVA = descuento;
	}
	
	public double getPrecio() {
		return precio - (precio*0.10);
	}

	public double getDescuentoIVA() {
		return descuentoIVA;
	}

}
