package udelp.edu.pooMaven;

import udelp.edu.pooMaven.model.Persona;
import udelp.edu.pooMaven.utility.Archivo;
import java.util.List;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) {

		Persona p = new Persona();
		p.setNombre("Dario Yael");
		List<Persona> listP = new ArrayList<>();
		listP.add(p);
		Archivo.guardaArchivo(Persona.class.getName(), listP);
		List<Persona> listPersona = Archivo.leerArchivo(Persona.class.getName());
		System.out.println(listPersona);
	}
}
