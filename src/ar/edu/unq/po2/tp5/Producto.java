package ar.edu.unq.po2.tp5;

public abstract class Producto implements Cobrable {
	protected String nombre;
	protected double precio;
	protected boolean precioCuidado;
	protected  Inventario inventario; 
	
	public Producto(String nombre, double precio , boolean precioCuidado, Inventario inventario) {
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
		this.inventario = inventario; 
		
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
	
	public void agregarStock(int stock) {
		this.inventario.agregarProducto(this, stock);
	}

	public int getStock() {
		return inventario.getStock(this);
	}
	
	public double cobrar() {
		inventario.actualizarStockDe(this);
		return getPrecio();
	}
	
}
