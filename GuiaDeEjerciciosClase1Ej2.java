package ejerciciosclases;

public class GuiaDeEjerciciosClase1Ej2 {

	public static void main(String[] args) {
		float ingresosminimos = 489083; int ndeinmuebles = 3, ndeautos = 3; boolean barco = true;
		float contribuyenteIngresos = 100000;int contribuyenteInmuebles = 3, contribuyenteAutos = 0; boolean contribuyenteBarco = false;
		
		if (contribuyenteIngresos > ingresosminimos) {
			System.out.println("Contribuyente pertenece a hogar de ingresos altos");
		}
		else {
			if (contribuyenteInmuebles >= 3 || contribuyenteAutos >= 3) {
				System.out.println("Contribuyente pertenece a hogar de ingresos altos (N° de propiedades)");
			}
			else {
				if (contribuyenteBarco == barco) {
					System.out.println("Contribuyente pertenece a hogar de ingresos altos (Tiene Barco)");
				}
				else{
					System.out.println("Contribuyente no pertenece a hogar de ingresos altos");
				}
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
