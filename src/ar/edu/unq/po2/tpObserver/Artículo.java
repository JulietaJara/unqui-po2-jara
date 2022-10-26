package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.List;

public class Artículo {
	private String título;
	private List<String> autores = new ArrayList<String>();
	private String tipo;
	private String lugarPublicación;
	private List<String> palabrasClaves = new ArrayList<String>();
	
	public Artículo(String tit, List<String> a, String t, String p, List<String> pc) {
		this.título = tit;
		this.autores = a;
		this.tipo = t; 
		this.lugarPublicación = p; 
		this.palabrasClaves = pc; 
	}
	
	public String getTítulo() {
		return título;
	}
	
	public void setTítulo(String título) {
		this.título = título;
	}
	
	public List<String> getAutores() {
		return autores;
	}
	
	public void setAutores(List<String> autores) {
		this.autores = autores;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getLugarPublicación() {
		return lugarPublicación;
	}
	
	public void setLugarPublicación(String lugarPublicación) {
		this.lugarPublicación = lugarPublicación;
	}
	
	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}
	
	public void setPalabrasClaves(List<String> palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
	}

	public void prueba() {
		// TODO Auto-generated method stub
		
	}
	

}
