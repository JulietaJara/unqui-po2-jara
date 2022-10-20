package ar.edu.unq.po2.tp3;

public class Multiplos {
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int multiploMayor() {
		int multMayor = 1000;
		while (!esMultiplo(multMayor, x, y)){
			multMayor = multMayor - 1;
		}
		return multMayor;
	}
	
	public boolean esMultiplo(int m, int x, int y) {
		return ((m%x == 0)& m%y == 0);
	}
	
	
}
