package clase4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		String ruta = "C:\\Users\\sacha\\eclipse-workspace\\proyectoEjercicios\\src\\clase4\\numeros a sumar.txt";
		System.out.println("Ingrese el tipo de operación (suma o multiplicacion): ");
		try (Scanner operacion = new Scanner(System.in)) {
			String operacionString = operacion.nextLine();
			
			sumarArchivo (ruta, operacionString);
		}
	}
		/*try {
			for (String linea : Files.readAllLines(Paths.get(ruta))) {
				System.out.println(linea);
			};
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("El archivo no existe");
			}

	}
	*/
	private static void sumarArchivo(String ruta, String operacion){
		try {
			for (String archivo : Files.readAllLines(Paths.get(ruta))) {
			System.out.println(archivo);	
		}
			int sumaValores = sumar(ruta, operacion);
			System.out.println("El resultado es: " + sumaValores);
		}
		catch (IOException e) {
		  // TODO Auto-generated catch block
		    System.out.println("El archivo no existe"); 
		}
		}
	public static int sumar(String ruta, String operacion) throws FileNotFoundException {
		File archivo = new File(ruta);
		int sumaint=0;
		
		if (operacion.equalsIgnoreCase("suma")) {
			try (Scanner sumaNumeros = new Scanner(archivo)) {
			
			while (sumaNumeros.hasNextInt()) {
				sumaint = sumaint + sumaNumeros.nextInt();
			}
			return sumaint;

		}
		
	}
		if (operacion.equalsIgnoreCase("multiplicacion")) {
			try (Scanner sumaNumeros = new Scanner(archivo)){
			sumaint = 1; 
			
			while (sumaNumeros.hasNextInt()) {
				
				sumaint = sumaint * sumaNumeros.nextInt();
			}
			return sumaint;

		}		
			
		}
		else {
			System.out.println("Ingresar 'suma' o 'multiplicacion' ");
			sumaint = 0;
			
			return sumaint;
		}
			
		}
		
		
		
	}

