package clase5;

public class ItemCarrito {
	private Carrito num;
	private Producto prod;
	private int cant;
	private double montoItem;
	
	public ItemCarrito(Carrito num, Producto producto, int cantidad) {
		num = num;
		prod = producto;
		this.cant = cantidad;
		montoItem = this.cant * prod.un_prec();
		
		
		
	}
	public int dameCant() {
		return cant;
	}
	public double dameMontoItem() {
		return montoItem;
	}
	public Producto dameProducto() {
		return prod;
	}
	public void mostrarItems() {
		System.out.println(cant+"\t"+prod.un_prec()+"\t"+montoItem+"\t\t"+prod.un_nombre());
	}
	public void mostrarTitulo() {
		System.out.println("Cant\tPrecio\tSubTotal\tProducto");
}
	public void totales(ItemCarrito vec[], Carrito carro, Cliente c1) {
		double total = 0.0;
		for (ItemCarrito Lista:vec) {
			Lista.mostrarItems();
			total = total + Lista.dameMontoItem();
		}
	}

}
