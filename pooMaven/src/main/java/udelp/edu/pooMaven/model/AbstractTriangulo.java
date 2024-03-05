package udelp.edu.pooMaven.model;

public abstract class AbstractTriangulo implements Figura {

	protected Double base;
	protected Double altura;
	
	public AbstractTriangulo (Double base, Double altura) {

		this.base = base;
		this.altura = altura;
	}

	public abstract String nombreFigura();

	public void getResultado() {

		System.out.println("La figura: " + nombreFigura() + "\nLados: " + 3 + "\nPerímetro: " + perimetro() + "\nÁrea: " + area());
	}

	public Double area() { 
		return (base * altura) / 2;
	}
}
