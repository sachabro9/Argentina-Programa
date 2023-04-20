package clase5;

import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Array de objetos
		Ejercicio2Carrito carros[] = new Ejercicio2Carrito[3];
		carros[0] = new Ejercicio2Carrito(0, 0, "1");
		carros[1] = new Ejercicio2Carrito(0, 0, "2");
		carros[2] = new Ejercicio2Carrito (0, 0, "3");

		//Crear objeto con cantidad precioUnitario producto hecho? 
		//Leer el archivo de texto
		String line="";
		String splitBy = ",";
		String[] producto = null;
		double total = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("src\\clase5\\Guia de Ejercicios Clase 1 - UTN (1).csv"))) {
			while ((line = br.readLine()) != null) {
				int i = 0;
				producto = line.split(splitBy);
				
				int cant = Integer.parseInt(producto[0]);
				carros[i].setCantidad(cant);
				
				double prec = Double.parseDouble(producto[1]);
				carros[i].setPrecio(prec);
				
				carros[i].setNombre(producto[2]);
				
				
				carros[i].setTotal(cant, prec);
				
				
				
				
				System.out.println(producto[0]+" "+producto[1]+" "+ producto[2]);
				//total = total + carros[i].precio();
				total = total + carros[i].darTotalProducto();
				i++;
			}
			System.out.println("El precio total por el carrito es " + total);

		
		}
		catch (IOException e)
		{
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//Imprimir la lista
		//Función carrito.precio() te da el total hecho?

	}




}
