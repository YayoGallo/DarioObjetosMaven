package udelp.edu.pooMaven.model;

import java.util.Random;
import lombok.Data;

@Data
public class Materia {

	private String nombre;
	private Integer semestre;
	private Carrera carrera;
	private String horario;
	private String id;
	
	
	public Materia(String nombre, Integer semestre, Carrera carrera, String horario) {
		this.nombre = nombre;
		this.semestre = semestre;
		this.carrera = carrera;
		this.horario = horario;
		this.id=generarID();
	}
	
	private String generarID() {

		String id = "";
		Random random = new Random();
		do {
			id += String.valueOf(random.nextInt(9) + 1);
		} while (id.length() < 3);
		return id;

	}
}
