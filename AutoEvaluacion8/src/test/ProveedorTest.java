package test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProveedorTest {

	//Datos para las pruebas
	private Proveedor proveedor1;
	private Proveedor proveedor2;
	
	/**
	 * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
	 */
	@Before 
	public void creaProveedor() {
		proveedor1 = new Proveedor("Pepe López Ruiz", "C/Luna 27, 30132 Murcia", 
							"+034 (968) 123 456", "pepe@gmail.com", 
							new GregorianCalendar()); 	
		proveedor2 = new Proveedor();
	}

	/**
	 * Método que se ejecuta después de cada @Test para limpiar datos de prueba.
	 */
	@After	
	public void borraProveedor() {
		Proveedor p1 = null;
		Proveedor p2 = null;
	}

	/**
	 * Después de ejecutar el constructor convencional en el método @Before 
	 * debe haber un objeto construido no null.
	 */
	@Test
	public void testProveedorConvencional() {
		assertNotNull(proveedor1);
	}

	/**
	 * Después de ejecutar el constructor por defecto en el método @Before 
	 * debe haber un objeto construido no null.
	 */
	@Test
	public void testProveedorDefecto() {
		assertNotNull(proveedor2);
	}

	/**
	 * Después de ejecutar el constructor copia
	 * debe haber un objeto construido no null.
	 */
	@Test
	public void testProveedorCopia() {
		Proveedor p = new Proveedor(proveedor1);
		assertNotNull(p);
	}

	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe tener un valor no null en el atributo.
	 */
	@Test
	public void testGetNombre() {
		assertNotNull(proveedor1.getNombre());
	}

	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe tener un valor no null en el atributo.
	 */
	@Test
	public void testGetDireccion() {
		assertNotNull(proveedor1.getDireccion());
	}
	
	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe tener un valor no null en el atributo.
	 */
	@Test
	public void testGetTelefono() {
		assertNotNull(proveedor1.getTelefono());
	}
	
	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe tener un valor no null en el atributo.
	 */
	@Test
	public void testGetCorreo() {
		assertNotNull(proveedor1.getCorreo());
	}
	
	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe tener un valor no null en el atributo.
	 */
	@Test
	public void testGetFechaAlta() {
		assertNotNull(proveedor1.getFechaAlta());
	}
	

	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetNombre() {
		proveedor2.setNombre("Pepe López Ruiz");
		assertEquals(proveedor2.getNombre(), "Pepe López Ruiz");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetNombreNull() {
		proveedor2.setNombre(null);	
		assertEquals(proveedor2.getNombre(), "Nombre Apellido Apellido");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetDireccion() {
		proveedor2.setDireccion("C/Luna 27, 30132 Murcia");	
		assertEquals(proveedor2.getDireccion(), "C/Luna 27, 30132 Murcia");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetDireccionNull() {
		proveedor2.setDireccion(null);	
		assertEquals(proveedor2.getDireccion(), "Calle 00, 00000 Población");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetTelefono() {
		proveedor2.setTelefono("+034 (968) 123 456");
		assertEquals(proveedor2.getTelefono(), "+034 (968) 123 456");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetTelefonoNull() {
		proveedor2.setTelefono(null);
		assertEquals(proveedor2.getTelefono(), "+034 (968) 000 000");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetCorreo() {
		proveedor2.setCorreo("pepe@gmail.com");	
		assertEquals(proveedor2.getCorreo(), "pepe@gmail.com");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetCorreoNull() {
		proveedor2.setCorreo(null);
		assertEquals(proveedor2.getCorreo(), "correo@correo.com");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testGenerarIdProveedor() {
		proveedor2.setNombre("Pepe López Ruiz");
		proveedor2.setTelefono("+034 (968) 123 456");
		assertEquals(proveedor2.getIdProveedor(), "PEP456");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetFechaAlta() {
		Calendar fec = new GregorianCalendar(2015, 4, 22);
		proveedor2.setFechaAlta(fec);	
		assertSame(fec, proveedor2.getFechaAlta());
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetFechaAltaNull() {
		Calendar f = new GregorianCalendar();
		proveedor2.setFechaAlta(null);	
		assertEquals(proveedor2.getFechaAlta().get(Calendar.YEAR), f.get(Calendar.YEAR));
		assertEquals(proveedor2.getFechaAlta().get(Calendar.MONTH), f.get(Calendar.MONTH));
		assertEquals(proveedor2.getFechaAlta().get(Calendar.DAY_OF_MONTH), f.get(Calendar.DAY_OF_MONTH));
	}
	
	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe obtenerse un texto como el esperado.
	 */
	@Test
	public void testToString() {
		assertNotNull(proveedor1.toString());
	}

} //class