package ejerciciosclases;
public class GuiaEjerciciosClase3Ej2 {

	public static void main(String[] args) {
		int n1 = 10 , n2 = 165, n3 = 2;
		int numeros []  = new int[3];
			if (n1>n2) {
				if(n1>n3) {
					numeros[0]=n1;
					if (n2>n3) {
						numeros[1]=n2;
						numeros[2]=n3;
					}
						else{
							numeros[1]=n3;
							numeros[2]=n2;
						}
					}
				}
			if (n2>n3) {
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
			else{
				numeros[0]= n3;
				if (n1>n2) {
					numeros[1]= n1;
					numeros[2]=n2;
				}else {
					numeros[1]=n2;
					numeros[2]=n1;
				}
			}
			for (int num : numeros ) {				
			System.out.print(num + ", ");
		}
	}

}
