package ar.edu.unq.po2.tp5;

public abstract class Producto implements Cobrable {
	protected String nombre;
	protected double precio;
	protected boolean precioCuidado;
	protected  Inventario stock; 
	
	public Producto(String nombre, double precio , boolean precioCuidado) {
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

	public int getStock() {
		return stock.getStock(this);
	}

	public void setStock(Inventario stock) {
		this.stock = stock;
	}
	
	public double cobrar() {
		stock.actualizarStockDe(this);
		return getPrecio();
	}
	
}
