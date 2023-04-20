 package clase5;

public class DescuentoFijo extends Descuento {
	//debe buscar el precio total del carrito
	public double valorFinal(double valorInicial) {
		return valorInicial - this.getValorDesc();
	}

}
