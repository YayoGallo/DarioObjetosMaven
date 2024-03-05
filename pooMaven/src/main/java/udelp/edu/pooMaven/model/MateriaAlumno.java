package udelp.edu.pooMaven.model;

import lombok.Data;

@Data
public class MateriaAlumno extends Materia {

	private Double primerParcial;
	private Double segundoParcial;
	private Double proyecto;
	private Double examenFinal;

	public MateriaAlumno(Materia materia) {
		super(materia.getNombre(), materia.getSemestre(), materia.getCarrera(), materia.getHorario());
	}
}
