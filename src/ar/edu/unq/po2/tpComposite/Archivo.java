package ar.edu.unq.po2.tpComposite;

import java.time.LocalDate;

public class Archivo implements FyleSystem{
	private String nombre;
	private int bytes;
	private LocalDate fechaModificación;
	private LocalDate fechaCreación;
	
	public Archivo(String nombre, int bytes, LocalDate fechaModificación, LocalDate fechaCreación) {
		this.nombre = nombre;
		this.bytes = bytes;
		this.fechaModificación = fechaModificación;
		this.fechaCreación = fechaCreación; 
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getBytes() {
		return bytes;
	}
	public void setBytes(int bytes) {
		this.bytes = bytes;
	}
	public LocalDate getFechaModificación() {
		return fechaModificación;
	}
	public void setFechaModificación(LocalDate fechaModificación) {
		this.fechaModificación = fechaModificación;
		
	}
	
	public LocalDate getFechaCreación() {
		return fechaCreación; 
	}
	
	public void setFechaCreación(LocalDate fechaCreación) {
		this.fechaCreación =fechaCreación; 
	}
	
	@Override
	public int totalSize() {
		return bytes;
	}
	@Override
	public void printStructure() {
		System.out.print(getNombre() + " " + getBytes() + " " +  getFechaModificación() + "\n"); ;
		
	}

	@Override
	public FyleSystem lastModified() {
		return this;
	}

	@Override
	public FyleSystem oldestElement() {
		return this; 
		
	} 
	
	public FyleSystem oldQue(FyleSystem fyle) {
		FyleSystem oldElem = this; 
		if (getFechaCreación().isAfter(fyle.getFechaCreación())) {
			oldElem = fyle;  
		}
		return oldElem; 
	}

	@Override
	public FyleSystem last(FyleSystem fyle) {
		// TODO Auto-generated method stub
		return this;
	}
	
	

}
