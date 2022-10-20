package ar.edu.unq.po2.Cartas;

public class Carta {
	private int número;
	private String palo;
	
	public Carta(int número, String palo) {
		this.número = número;
		this.palo = palo; 
	}
	
	public int getNúmero() {
		return número;
	}
	public void setNúmero(int número) {
		this.número = número;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	public boolean isMayor(Carta carta) {
		return (this.getNúmero() > carta.getNúmero()); 
	}
	
	public boolean isPaloEquals(Carta carta) {
		return (this.getPalo() == carta.getPalo()); 
	}
	
	

}
