package clase7;

public class DescuentoConTope extends Descuento{

	public double valorFinal(double valorInicial) {
		int tope = 200;
		if (valorInicial*this.getValorDesc()*0.01 > tope) {
			return valorInicial-200;
			
		}
		else {
			double factor = 1 - this.getValorDesc()*0.01;
			return valorInicial*factor;
			
		}
	}

}
