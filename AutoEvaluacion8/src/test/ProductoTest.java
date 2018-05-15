package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import persona.Proveedor;
import persona.Producto;
import persona.TipoProducto;

public class ProductoTest {

	//Datos para las pruebas
	private Producto producto1;
	private static Producto producto2;

	/**
	 * Método que se ejecuta una sola vez al principio del conjunto pruebas.
	 * @throws DatosException 
	 */
	@BeforeClass
	public static void iniciarlizarDatosFijos() {
		// Objetos no modicados en las pruebas.
		producto2 = new Producto(
				"Calabaza amarilla", 
				2.50, 
				new Proveedor("Pepe López Ruiz", "C/Luna 27, 30132 Murcia", 
						"+034 (968) 123 456", "pepe@gmail.com", new GregorianCalendar()), 
				TipoProducto.IMPORTADO
				); 	
	}
	
	/**
	 * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
	 */
	@Before 
	public void creaProducto() {
		producto1 = new Producto();
	}

	/**
	 * Método que se ejecuta después de cada @Test para limpiar datos de prueba.
	 */
	@After	
	public void borraProducto() {
		producto1 = null;
	}

	/**
	 * Después de ejecutar el constructor convencional en el método @Before 
	 * debe haber un objeto construido no null.
	 */
	@Test
	public void testProductoConvencional() {
		assertNotNull(producto2);
	}

	/**
	 * Después de ejecutar el constructor por defecto en el método @Before 
	 * debe haber un objeto construido no null.
	 */
	@Test
	public void testProductoDefecto() {
		assertNotNull(producto1);
	}

	/**
	 * Después de ejecutar el constructor copia
	 * debe haber un objeto construido no null.
	 */
	@Test
	public void testProductoCopia() {
		Producto p = new Producto(producto2);
		assertNotNull(p);
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetNombre() {
		producto1.setNombre("Calabaza amarilla");	
		assertEquals(producto1.getNombre(), "Calabaza amarilla");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetPrecioCoste() {
		producto1.setPrecioCoste(2.50);	
		assertTrue(producto1.getPrecioCoste() == 2.50);
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetSuministrador() {
		Proveedor p = new Proveedor("Pepe López Ruiz", 
									"C/Luna 27, 30132 Murcia", 
									"+034 (968) 123 456", 
									"pepe@gmail.com", 
									new GregorianCalendar());
		producto1.setSuministrador(p);
		assertSame(producto1.getSuministrador(), p);
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetTipo() {
		producto1.setTipo(TipoProducto.IMPORTADO);	
		assertEquals(producto1.getTipo(), TipoProducto.IMPORTADO);
	}
	
	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe obtenerse un texto como el esperado.
	 */
	@Test
	public void testToString() {
		assertNotNull(producto2.toString());
	}

	// Test CON DATOS NO VALIDOS
	/**
	 * Una vez se tiene un objeto, creado en el método @BeforeClass, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetNombreNull() {
		try {
			producto2.setNombre(null);
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
	public void testSetPrecioCosteNoValido() {
		producto1.setPrecioCoste(0);	
		assertTrue(producto1.getPrecioCoste() == 1.0);

		producto1.setPrecioCoste(-3.0);	
		assertTrue(producto1.getPrecioCoste() == 1.0);
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetSuministradorNull() {
		try {
			producto2.setSuministrador(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) { 
		}
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @BeforeClass, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetTipoNull() {
		try {
			producto2.setTipo(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) { 
		}
	}
	
} // class
