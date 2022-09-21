package ar.edu.unq.po2.tp5;

public abstract class Producto {
	protected String nombre;
	protected double precio;
	protected boolean precioCuidado;
	protected  int stock; 
	
	public Producto(String nombre, double precio , boolean precioCuidado, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
		this.stock = stock; 
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void decrementarStock() {
		this.stock = this.stock - 1; 
	}

}
