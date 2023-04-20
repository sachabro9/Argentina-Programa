package clase5;

public class Ejercicio2Carrito {
	public int cantidad;
	public double precio;
	public String nombre;
	public double totalProducto;
	
	
	
	public Ejercicio2Carrito(int cant, double precio, String nombre) {
		this.cantidad = cant;
		this.precio = precio;
		this.nombre = nombre;		
		this.totalProducto = this.cantidad*this.precio;
		
		
	}
	
		
	
	
	public double darTotalProducto() {	
		return this.totalProducto;
	}
	
	public void setTotal(int cantidad, double prec) {
		this.totalProducto = cantidad*prec;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public  void setPrecio(double prec) {
		this.precio = prec;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



}
