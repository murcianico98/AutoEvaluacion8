package persona;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Proveedor extends Persona{
	
	private String idProveedor = new String();
	
	private GregorianCalendar fechaAlta = new GregorianCalendar();
	
	/*
	 * Constructor convencional
	 */
	
	public Proveedor(String nombre, String direccion, String telefono, String correo,
			String idProveedor, GregorianCalendar fechaAlta) {
		super (nombre, direccion, telefono, correo);
		
	}
	
	/*
	 * Constructor por defecto
	 */
	
	public Proveedor() {
		this("Pepico", "Calle Invencion 21", "+034 (968) 645 241", 
				"PepicoElMasChulico@gmail.com", "PEP241", "2018/11/04");
	}
	
	/*
	 * Constructor copia
	 */
	
	public Proveedor(Proveedor proveedor){
		 
	
		
		nombre = new String(proveedor.nombre);
		direccion = new String(proveedor.direccion);
		telefono = new String(proveedor.telefono);
		correo = new String(proveedor.correo);
		idProveedor = new String(proveedor.idProveedor);
		fechaAlta = new GregorianCalendar(proveedor.fechaAlta);
	}

}
