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
			Calendar fechaAlta) {
		super (nombre, direccion, telefono, correo);
		idProveedor = GenerarIdProveedor(nombre, telefono);
		setIdProveedor(idProveedor);
		setFechaAlta(fechaAlta);
		
	}
	
	/*
	 * Constructor por defecto
	 */
	
	public Proveedor() {
		this("Pepico", "Calle Invencion 21", "+034 (968) 645 241", 
				"PepicoElMasChulico@gmail.com", new GregorianCalendar());
	}
	
	/*
	 * Constructor copia
	 */
	
	public Proveedor(Proveedor proveedor){
		 
	this(
		
		new String(proveedor.nombre),
		new String(proveedor.direccion),
		new String(proveedor.telefono),
		new String(proveedor.correo),
		new GregorianCalendar(proveedor.fechaAlta.get(Calendar.YEAR),
				proveedor.fechaAlta.get(Calendar.MONTH),
				proveedor.fechaAlta.get(Calendar.DAY_OF_MONTH))
		);
	}
	
	
	
	public void setIdProveedor(String idProveedor){
		
		
		
		this.idProveedor = idProveedor;
		
	}
	
	public void setFechaAlta(Calendar fechaAlta) {
		assert fechaAlta != null;
		this.fechaAlta = (GregorianCalendar) fechaAlta;
		
	}
	
	public String getIdProveedor(){
		
		return idProveedor;
		
	}
	
	public Calendar getFechaAlta() {
		return fechaAlta;
	}
	
	public String GenerarIdProveedor(String nombre, String telefono) {
		
		String idProveedor=""
		+ nombre.substring(0,3).toUpperCase();
		idProveedor += telefono.substring(15, 18);
		
		
		
		
		return idProveedor;
		
	}

}
