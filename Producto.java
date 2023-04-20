package clase5;

public class Producto {
	private int codigo;
	private String nombre;
	private String desc;
	private double precio;
	private int stock;
	
	public Producto(int cod, String nom, String descripcion, double prec, int sto){
		codigo = cod;
		nombre = nom;
		desc = descripcion;	
		precio = prec;
		stock = sto;
	}
	
	public int un_codigo() {
		return codigo;
	}
	public String un_nombre() {
		return nombre;
	}
	public String un_desc() {
		return desc;
	}
	public double un_prec() {
		return precio;
	}
	public int un_stock() {
		return stock;
	}
		
	}
