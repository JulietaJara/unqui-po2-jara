package ar.edu.unq.po2.tp3;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate fechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int getEdad() {
		
		LocalDate fechaDeHoy = LocalDate.now();
		Period periodo = Period.between(fechaDeNacimiento, fechaDeHoy);
		return periodo.getYears();
		
	}
	
	public boolean menorQue(Persona persona) {
		int edad = persona.getEdad();
		return this.getEdad() < edad;
	}

}

	