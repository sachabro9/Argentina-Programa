package ejerciciosclases;

public class GuiaEjerciciosClase3Ej1 {

	public static void main(String[] args) {
		String txt1 = "Esto es Perfecto";
		char letra = 'e';
		int conteo = 0;
		for (int i = 0; i < txt1.length(); i++) {
			if (txt1.toLowerCase().charAt(i)== letra) {
				conteo++;				
			}
		}
		System.out.print(conteo);
		// TODO Auto-generated method stub

	}

}
