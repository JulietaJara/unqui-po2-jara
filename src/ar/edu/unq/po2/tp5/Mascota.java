package ar.edu.unq.po2.tp5;

public class Mascota  implements ImprimibleNombre{
	
	private String nombre;
	private String raza;
	
	public Mascota(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public void printIn() {
		System.out.print(this.nombre + " ");
	}
	

}
