package clase5;

public class Ejercicio1 {

	public static void main(String[] args) {
		Producto p1 = new Producto(101,"Arroz","Largo fino 0000 x 500gr", 250.35, 1000);
		Producto p2 = new Producto(102,"Mate","Rosamonte x 500gr", 300, 100);
		Producto p3 = new Producto(103,"Polenta","italiana x 500gr", 500, 3000);
		Producto p4 = new Producto(104,"Amor","verdadero x 500gr", 1000, 100000);
		
		Cliente c1 = new Cliente(101,26638449,"Sacha Bronstein", "Rodriguez 345");
		Carrito carro = new Carrito(25,c1);
		
		ItemCarrito itemC[] = new ItemCarrito[3];
		
		itemC[0] = new ItemCarrito(carro, p1, 2);
		itemC[1] = new ItemCarrito(carro, p2, 5);
		itemC[2] = new ItemCarrito (carro, p3, 1);
		itemC[0].mostrarTitulo();
		double total = mostrarItems(itemC, carro, c1);
		carro.mostrarMontoTotal(total);
		// aplicamos descuento
		
		Descuento desc1 = new DescuentoFijo();
		Descuento desc2 = new DescuentoPor();
		desc1.setValorDesc(150.0);
		desc2.setValorDesc(10.0);
		System.out.println("El precio con el descuento fijo es " + desc1.valorFinal(total));
		System.out.println("El precio con el descuento porcentual es " + desc2.valorFinal(total));
		

	}
	
	public static double mostrarItems(ItemCarrito vec[], Carrito carro, Cliente c1) {
		
		double total = 0.0;
		for (ItemCarrito Lista:vec) {
			Lista.mostrarItems();
			total = total + Lista.dameMontoItem();
		}
		return total;
		// tarea modificar lo anterior para que funcione con atributo y no con variable.
		
	}

}
