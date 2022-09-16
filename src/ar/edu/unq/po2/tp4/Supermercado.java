package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos = new ArrayList<Producto>(); 
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void agregarProducto(Producto p) {
		productos.add(p);
	}
	
	public int cantTotalDeProductos() {
		return productos.size();
	}
	
	public double cantTotalDePrecios() {
		double cantPrecios = 0;
		for(Producto producto:productos) {
			cantPrecios = cantPrecios + producto.getPrecio();
		}
		return cantPrecios;
	}
	

}
