package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	private double precio;
	private boolean precioCuidado;
	private boolean primeraNecesidad;
	private double descuento;
	
	public Producto(String nombre, float precio, boolean primeraNecesidad, double descuento) {
		this.nombre = nombre;
		this.precio = precio;
		this.primeraNecesidad = primeraNecesidad;
		this.descuento = descuento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		double precioProductoFinal = precio;  
		if (isPrimeraNecesidad()) {
			precioProductoFinal = precioProductoFinal * descuento;
		} 
		return precioProductoFinal; 
	}
	
	public double getDescuento() {
		return descuento;
	}
	
	
	public boolean isPrecioCuidado() {
		return precioCuidado;
	}
	public void setPrecioCuidado(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}
	
	public boolean isPrimeraNecesidad() {
		return primeraNecesidad;
	}
	
}
