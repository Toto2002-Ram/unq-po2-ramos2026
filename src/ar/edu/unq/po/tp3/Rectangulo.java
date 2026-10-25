package ar.edu.unq.po.tp3;


public class Rectangulo {
 
	private Point origen;
	private int base;
	private int altura;


	public Rectangulo(Point origen, int base, int altura) {
		this.origen = origen;
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public Point getOrigen() {
		return origen;
	}

	
    public int areaDelRectangulo() {
		
		return (this.getBase() * this.getAltura());
	}

	public int perimetroDelRectangulo() {
		
		return 2*(this.getBase() + this.getAltura());
	}

	public boolean esVertical() {
		if (this.getAltura() > this.getBase()) {
		   return true;
		}
		return false;
	}

	public boolean esHorizontal() {
		if (this.getAltura() < this.getBase()) {
			   return true;
		}
		return false;
	}

	public void moverRectanguloA(Point puntoDestino) {
		
		this.origen = puntoDestino;
		
	}
	
}

