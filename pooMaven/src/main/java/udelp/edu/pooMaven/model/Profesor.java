package udelp.edu.pooMaven.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Data;
import udelp.edu.pooMaven.utility.Constantes;

@Data
public class Profesor extends Persona {

	private Date fechaDeIngreso;
	private List<Materia> materias;
	public Profesor(String nombre,String fechaNacimiento, Character sexo, String fechaDeIngreso) throws ParseException {
		
		super(nombre, fechaNacimiento, sexo);
		SimpleDateFormat formatoFecha = new SimpleDateFormat(Constantes.FORMATO);
        this.fechaDeIngreso = formatoFecha.parse(fechaNacimiento);
		
	}
	public void addMateria (Materia materia) {
		if (null != materias) {
			this.materias.add(materia);
		} else {
			this.materias = new ArrayList<Materia>();
			this.materias.add(materia);
		}
	}
}
