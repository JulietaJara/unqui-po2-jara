package ar.edu.unq.po2.tp3;


public class Rectangulo {
	
	Point point = new Point(); 
	
	public void create(int x, int y) {
		point.create(x, y);
	}
	
	public int area() {
		int area = point.getX() * point.getY();
		return area;
	}
	
	public int perimetro() {
		int perimetro = point.getX()*2 + point.getY()*2;
		return perimetro;
	}
	
	public boolean isHorizontal() {
		return (point.getX() > point.getY());
	}
	
	public boolean isVertical() {
		return (point.getX()< point.getY());
	}
}
