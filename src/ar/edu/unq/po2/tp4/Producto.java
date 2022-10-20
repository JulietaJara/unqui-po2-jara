package ar.edu.unq.po2.tp4;

<<<<<<< HEAD
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


=======
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
>>>>>>> 34b690944f9c4af76927824dc22f1b6fc71a089c
	public void setPrecioCuidado(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}
	
<<<<<<< HEAD
}
=======
	public boolean isPrimeraNecesidad() {
		return primeraNecesidad;
	}
	
}
>>>>>>> 34b690944f9c4af76927824dc22f1b6fc71a089c
