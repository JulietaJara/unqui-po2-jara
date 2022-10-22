package ar.edu.unq.po2.tpComposite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio implements FyleSystem{
	private String nombre;
	private LocalDate fechaCreación;
	private List<FyleSystem> contenido = new ArrayList<FyleSystem>();
	
	public Directorio(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fechaCreación = fecha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaCreación() {
		return fechaCreación;
	}
	public void setFechaCreación(LocalDate fechaCreación) {
		this.fechaCreación = fechaCreación;
	}
	
	public void agregarFyle(FyleSystem file) {
		contenido.add(file); 
	}
	
	public int getBytes() {
		return totalSize(); 
	}
	
	@Override
	public int totalSize() {
		int bytes = 0; 
		for(FyleSystem fyle : contenido) {
			bytes += fyle.getBytes(); 
		}
		return bytes;
	}
	
	@Override
	public void printStructure() {
		System.out.print(getNombre() + " " + getFechaCreación() + "\n");
		for (FyleSystem fyle : contenido) {
			fyle.printStructure();
		}
		
	}
	@Override
	public FyleSystem lastModified() {
		FyleSystem elemNuevo = this; 
		for(FyleSystem fyle : contenido) {
			elemNuevo = fyle.last(elemNuevo); 
		}
		return elemNuevo;
	}
	
	@Override
	public FyleSystem last(FyleSystem fyle) {
		return lastModified();
	}
	
	@Override
	public FyleSystem oldestElement() {
		FyleSystem oldElem = this; 
		for(FyleSystem fyle : contenido) {
			oldElem = fyle.oldQue(oldElem); 
			
		}
		return oldElem;
	}
	
	public FyleSystem oldQue(FyleSystem fyle) {
		return oldestElement(); 
	}                 
	
}

