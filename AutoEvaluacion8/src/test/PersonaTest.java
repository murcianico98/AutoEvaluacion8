package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import persona.Persona;
import persona.Proveedor;

public class PersonaTest {

	//Datos para las pruebas
	private Persona persona1;
	private static Persona persona2;
	
	/**
	 * Método que se ejecuta una sola vez al principio del conjunto pruebas.
	 * @throws DatosException 
	 */
	@BeforeClass
	public static void iniciarlizarDatosFijos() {
		// Objetos no modicados en las pruebas.
			persona2 = new Proveedor("Pepe López Ruiz", "C/Luna 27, 30132 Murcia", 
					"+034 (968) 123 456", "pepe@gmail.com", new GregorianCalendar());
	}
	
	/**
	 * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
	 */
	@Before 
	public void creaProveedor() {	
		persona1 = new Proveedor();
	}

	/**
	 * Método que se ejecuta después de cada @Test para limpiar datos de prueba.
	 */
	@After	
	public void borraProveedor() {
		persona1 = null;
	}

	/**
	 * Una vez se tiene un objeto, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetNombre() {
		persona1.setNombre("Pepe López Ruiz");
		assertEquals(persona1.getNombre(), "Pepe López Ruiz");
	}
	
	/**
	 * Una vez se tiene un objeto, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetDireccion() {
		persona1.setDireccion("C/Luna 27, 30132 Murcia");	
		assertEquals(persona1.getDireccion(), "C/Luna 27, 30132 Murcia");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetTelefono() {
		persona1.setTelefono("+034 (968) 123 456");
		assertEquals(persona1.getTelefono(), "+034 (968) 123 456");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetCorreo() {
		persona1.setCorreo("pepe@gmail.com");	
		assertEquals(persona1.getCorreo(), "pepe@gmail.com");
	}
	
	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe obtenerse un texto como el esperado.
	 */
	@Test
	public void testToString() {
		assertNotNull(persona2.toString());
	}

	// Test CON DATOS NO VALIDOS
	/**
	 * Una vez se tiene un objeto, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetNombreNull() {
		try {
			persona1.setNombre(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) { 
		}
	}
	
	/**
	 * Una vez se tiene un objeto, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetDireccionNull() {
		try {
			persona1.setDireccion(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) { 
		}
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetTelefonoNull() {
		try {
			persona1.setTelefono(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) { 
		}
	}
	
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetCorreoNull() {
		try {
			persona1.setCorreo(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) { 
		}
	}
	
} //class