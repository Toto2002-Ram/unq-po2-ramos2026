package ar.edu.unq.po.tp3;

public class Cuadradro {
	
	private Point origen;
	private int base;
	private int altura;
	
	public Cuadradro(Point origen, int base, int altura) {
		this.origen = origen;
		this.base = base;
		this.altura = altura;
	}

	public Point getOrigen() {
		return origen;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}

	public int areaDelCuadradro() {

		return (this.getBase() * this.getAltura()); 
	}

	public int perimetroDelCuadradro() {
		
		return (this.getAltura()*2) + (this.getBase()*2);
	}

	public void moverCuadradoA(Point puntoDestino) {
		
		this.origen = puntoDestino;
		
	}

}
