package ejerciciosclases;

public class GuiaDeEjercicio1 {

	public static void main(String[] args) {
			int ninicio = 1;
			int nfinal = 20;
			int x = ninicio;
			//1a
			while (x<nfinal) {
				System.out.print(x +", ");
				x++;
			}
			System.out.println(x);
			
			// 1b
			x = ninicio;
			while (x<=nfinal) {
				if (x % 2 == 0) {
					System.out.print(x + ", ");					
				}
				x++;
			}
			System.out.println("");
			
			// 1c no entendi la consigna
			// 1d 
			for (int i = nfinal; i >= ninicio ; i--) {
				if (i % 2 == 0) {
					System.out.print(i + ", ");					
				}
				
			}
			
			
		// TODO Auto-generated method stub

	}

}
