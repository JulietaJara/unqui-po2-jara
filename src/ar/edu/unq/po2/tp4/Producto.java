package ar.edu.unq.po2.tp4;

public abstract class Producto {
	protected String nombre;
	protected double precio;
	protected boolean precioCuidado;
	
	
	public Producto(String nombre, double precio, boolean precioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public abstract double getPrecio(); 


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public boolean isPrecioCuidado() {
		return precioCuidado;
	}


	public void setPrecioCuidado(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}
	
}