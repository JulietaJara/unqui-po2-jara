package ar.edu.unq.po2.tp3;

public class PersonaDeEquipo {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public PersonaDeEquipo(String unNombre, String unApellido, int unaEdad) {
		nombre = unNombre;
		apellido = unApellido;
		edad = unaEdad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
