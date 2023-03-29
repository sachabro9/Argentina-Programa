package clase4;

import java.util.Scanner;

public class Ejercicio1b {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		Scanner character = new Scanner (System.in);
		System.out.println("Ingrese el 1er numero: ");
		int num1 = numero.nextInt();
		System.out.println("Ingrese el 2do numero: ");
		int num2 = numero.nextInt();
		System.out.println("Ingrese el 3er numero: ");
		int num3 = numero.nextInt();
		System.out.println("Ingrese el orden a");
		char orden = character.next().charAt(0);
		ordenarNumeros (num1, num2, num3, orden);
		// notVar (num1);
		
	}
	/*public static void notVar (int n) {
		if (n == 0) {
			Scanner numero = new Scanner(System.in);
			System.out.println("Ingrese un numero: ");
			n = numero.nextInt();			
		}
	}
	*/
	public static void ordenarNumeros(int n1, int n2, int n3, char orden) {
		int numeros[] = new int[3];
	
		if (n1>n2 && n1>n3) {
				numeros[0]=n1;
				if (n2>n3) {
					numeros[1]=n2;
					numeros[2]=n3;
				}
				if (n2<n3){
					numeros[1]=n3;
					numeros[2]=n2;
					}
				}
		
		if (n2>n1 && n2 > n3) {
			numeros[0]=n2;
			if(n1>n3) {
				numeros[1]=n1;
				numeros[2]=n3;
			}
			else {
				numeros[1]=n3;
				numeros[2]=n1;
			}
		}
		
		if (n3> n2 && n3> n1){
			numeros[0]= n3;
			if (n1>n2) {
				numeros[1]= n1;
				numeros[2]=n2;
			}
			else {
				numeros[1]=n2;
				numeros[2]=n1;
			}
		}
		
		if(orden == 'a'){				
		System.out.print(numeros[2] + ", " + numeros[1] + ", " + numeros[0]);
	}
		else {
			System.out.print(numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
			
		}
			
		}

}
