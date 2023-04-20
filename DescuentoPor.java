package clase5;

public class DescuentoPor extends Descuento {
	public double valorFinal(double valorInicial) {
		double factor = 1 - this.getValorDesc()*0.01;
		return valorInicial*factor;
		
	}
	

}
