package ar.edu.unq.po2.tp4;

public class ProductoDePrimeraNecesidad extends Producto{
	private double descuento;
	
	public ProductoDePrimeraNecesidad(String nombre, double d, boolean precioCuidado, double descuento) {
		super(nombre, d, precioCuidado);
		this.descuento = descuento; 
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	public double getPrecio() {
		return precio*descuento;
	}
	

}
