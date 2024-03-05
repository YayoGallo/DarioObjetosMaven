package udelp.edu.pooMaven.model;

import java.text.ParseException;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class Estudiante extends Persona {
	
	private Integer semestre;
	private String generacion;
	private Carrera carrera;
	
	private List<MateriaAlumno> materias;
	
	public Estudiante(String nombre,String fechaNacimiento, Character sexo) throws ParseException {
		
		super(nombre, fechaNacimiento, sexo);
		
	}
}