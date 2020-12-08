package dad.fx.GsonSample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persona {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Datos p = new Datos();

		System.out.println("Introduce los datos de las personas: ");
		p.Nombre = scanner.nextLine();
		p.Apellidos = scanner.nextLine();
		p.Edad = scanner.nextInt();

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);

		/*
		 * Ejemplo de salida en formato JSON generada por la aplicación:
		 * 
		 * { 
		 * "nombre": "Chuck", 
		 * "apellidos": "Norris", 
		 * "edad": 67 
		 * }
		 */

scanner.close();
	}

}
