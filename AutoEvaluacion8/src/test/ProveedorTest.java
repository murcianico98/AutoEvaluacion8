package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import persona.Proveedor;

public class ProveedorTest {

	//Datos para las pruebas
	private Proveedor proveedor1;
	private static Proveedor proveedor2;
	
	/**
	 * Método que se ejecuta una sola vez al principio del conjunto pruebas.
	 * @throws DatosException 
	 */
	@BeforeClass
	public static void iniciarlizarDatosFijos() {
		// Objetos no modicados en las pruebas.
		proveedor2 = new Proveedor("Pepe López Ruiz", "C/Luna 27, 30132 Murcia", 
				"+034 (968) 123 456", "pepe@gmail.com", new GregorianCalendar());
	}
	
	/**
	 * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
	 */
	@Before 
	public void creaProveedor() { 	
		proveedor1 = new Proveedor();
	}

	/**
	 * Método que se ejecuta después de cada @Test para limpiar datos de prueba.
	 */
	@After	
	public void borraProveedor() {
		proveedor1 = null;
	}

	/**
	 * Después de ejecutar el constructor convencional en el método @Before 
	 * debe haber un objeto construido no null.
	 */
	@Test
	public void testProveedorConvencional() {
		assertNotNull(proveedor2);
	}

	/**
	 * Después de ejecutar el constructor por defecto en el método @Before 
	 * debe haber un objeto construido no null.
	 */
	@Test
	public void testProveedorDefecto() {
		assertNotNull(proveedor1);
	}

	/**
	 * Después de ejecutar el constructor copia
	 * debe haber un objeto construido que no sea el mismo.
	 */
	@Test
	public void testProveedorCopia() {
		Proveedor p = new Proveedor(proveedor2);
		assertNotSame(p, proveedor2);
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testGenerarIdProveedor() {
		proveedor1.setNombre("Pepe López Ruiz");
		proveedor1.setTelefono("+034 (968) 123 456");
		assertEquals(proveedor1.getIdProveedor(), "PEP456");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetFechaAlta() {
		Calendar fec = new GregorianCalendar(2015, 4, 22);
		proveedor1.setFechaAlta(fec);	
		assertSame(fec, proveedor1.getFechaAlta());
	}
	
	// Test CON DATOS NO VALIDOS
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetFechaAltaNull() {
		Calendar f = new GregorianCalendar();
		proveedor1.setFechaAlta(null);	
		assertEquals(proveedor1.getFechaAlta().get(Calendar.YEAR), f.get(Calendar.YEAR));
		assertEquals(proveedor1.getFechaAlta().get(Calendar.MONTH), f.get(Calendar.MONTH));
		assertEquals(proveedor1.getFechaAlta().get(Calendar.DAY_OF_MONTH), f.get(Calendar.DAY_OF_MONTH));
	}
	
	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe obtenerse un texto como el esperado.
	 */
	@Test
	public void testToString() {
		assertNotNull(proveedor2.toString());
	}

} //class