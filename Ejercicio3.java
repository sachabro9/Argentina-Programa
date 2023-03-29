package clase4;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ejercicio3 {
	public static void main(String[] args) throws IOException {
		String ruta = "C:\\Users\\sacha\\eclipse-workspace\\proyectoEjercicios\\src\\clase4\\Escribir nombres.txt";
		Path direccion = Paths.get(ruta);
		Files.writeString(direccion, "Juan, Tomás, Pedro, Lucia, Ramona, Alberto, Felipe, Ariadna, Gervacio, Edelmiro");
	}
	/*
		String lista = "Juan, Tomás, Pedro, Lucia, Ramona, Alberto, Felipe, Ariadna, Gervacio, Edelmiro";
		String[] listaPartida = lista.split(" ");
		for (String nombre : listaPartida) {
			System.out.print(nombre+" ");
	}
*/

}
