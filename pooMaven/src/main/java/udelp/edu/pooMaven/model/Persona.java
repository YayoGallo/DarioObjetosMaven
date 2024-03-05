package udelp.edu.pooMaven.model;

import lombok.Data;
import java.util.Date;
import udelp.edu.pooMaven.utility.Constantes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

@Data
public class Persona {

	private String nombre;

	private Date fechaNacimiento;

	private String id;

	private Character sexo;

	private Double peso;

	private Double altura;

	public Persona() {

		this.id = generarID();

	}

	public Persona(String nombre, String fechaNacimiento, Character sexo) throws ParseException {

		this.nombre = nombre;
		SimpleDateFormat formatoFecha = new SimpleDateFormat(Constantes.FORMATO);
		this.fechaNacimiento = formatoFecha.parse(fechaNacimiento);
		this.sexo = sexo;
		this.id = generarID();

	}

	public Persona(String nombre, String fechaNacimiento, Character sexo, Double peso, Double altura)
			throws ParseException {

		this.nombre = nombre;
		SimpleDateFormat formatoFecha = new SimpleDateFormat(Constantes.FORMATO);
		this.fechaNacimiento = formatoFecha.parse(fechaNacimiento);
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.id = generarID();

	}

	private String generarID() {

		String id = "";
		Random random = new Random();
		do {
			id += String.valueOf(random.nextInt(9) + 1);
		} while (id.length() < 8);
		return id;

	}
}