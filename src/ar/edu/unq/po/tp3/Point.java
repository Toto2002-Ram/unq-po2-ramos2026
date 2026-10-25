package ar.edu.unq.po.tp3;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this(0,0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void moverPuntoA(int nuevoX, int nuevoY) {
		this.x = nuevoX;
		this.y = nuevoY;
	}

	public void SumarConPunto(Point punto2) {
		
		this.x = this.getX() + punto2.getX();
		this.y = this.getY() + punto2.getY();
	}
}
