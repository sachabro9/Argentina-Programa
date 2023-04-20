package clase7;

public class Cliente {
	private int codigo;
	private int dni;
	private String nombre;
	private String dire;
	
	public Cliente(int codigo, int dni, String nombre, String dire) {
		this.codigo=codigo;
		this.dni=dni;
		this.nombre=nombre;
		this.dire=dire;
		}
	public int dameDni() {
		return dni;
	}
	public int dameCodigo() {
		return codigo;
	}
	public String dameNombre() {
		return nombre;
	}
	public String dameDire() {
		return dire;
	}

} 
