package persona;

public class Producto {
	
	private String nombre;
	private double precioCoste;
	private TipoProducto tipoProducto;
	private Proveedor suministrador;
	
	/**
	 * 
	 * @param nombre
	 * @param precioCoste
	 * @param tipoProducto
	 * @param suministrador
	 */
	
	//Constructor convencional.
	
	public Producto(String nombre, double precioCoste, Proveedor suministrador, TipoProducto tipoProducto) {
		
		
		
	}
	
	//Constructor por defecto
	
	public Producto(){
		this ("Carlos", 215.642, new Proveedor(), TipoProducto.NACIONAL);
	}
	
	private boolean nombreValido(String nombre) {
		if (nombre.equals("") || nombre.equals("")) {
			return false;
		}
		return true;
	}
	
	
	
	
	
	
	
	
	private boolean precioCosteValido(double precioCoste) {
		return precioCoste > 0;
	}
	
	

}
