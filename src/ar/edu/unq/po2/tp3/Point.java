package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void create(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void create() {
		x = 0;
		y = 0;
	}
	
	public void moveX(int nuevaPosición) {
		x = nuevaPosición;
	}
	
	public void moveY(int nuevaPosición) {
		y = nuevaPosición;
	}
	
	public int sumarPoints() {
		int nuevoPoint = x + y;
		return nuevoPoint;
	}

}
