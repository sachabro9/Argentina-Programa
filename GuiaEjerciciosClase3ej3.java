package ejerciciosclases;

public class GuiaEjerciciosClase3ej3 {
	public static void main(String[] args) {
		int numeros[]= new int[] {1, 50, 300, 500, 1000, 3000};
		int x = 60;
		int resultado = 0;
		
		for (int num : numeros) {
			if (num > x) {
				resultado = resultado + num;
				
			}
		}
		System.out.print(resultado);
	}

}
