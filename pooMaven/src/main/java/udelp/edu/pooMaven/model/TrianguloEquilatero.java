package udelp.edu.pooMaven.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data


public class TrianguloEquilatero extends AbstractTriangulo {

	
	public TrianguloEquilatero (Double base, Double altura) {

		super(base, altura);
	}
	
	
	public Double perimetro() {

		return base * 3;
	}
	

	@Override
	public String nombreFigura() {
	
		return "Triángulo Equilátero";
	}
	
}
