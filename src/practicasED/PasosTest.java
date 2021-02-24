 package practicasED;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class PasosTest {
	
	Pasos p;
	int n;
	@org.junit.jupiter.api.BeforeAll
	static void BeforeAll() {
		System.out.println("Comenzando las pruebas");	
	}
	
	@BeforeEach
	void BeforeEach() {
		p = new Pasos();
		System.out.println("Fin de test");	
	}
	@AfterEach
	void AfterEach() {
		System.out.println("Fin de test");
	}
	
	@Test()
	void test() {
		 Exception exception = assertThrows(IllegalArgumentException.class, () ->
         p.esfuerzo(-1));
		 assertEquals("No se pueden caminar pasos negativos", exception.getMessage());
 }

	@Test
	void testEsfuerzoMinimo() {
		n = p.esfuerzo(0);
		assertEquals(1,n);
	}
	@Test
	void testEsfuerzoBasico() {
		n = p.esfuerzo(500);
		assertEquals(1,n);
	}

	@Test
	void testEsfuerzoMedio() {
		n = p.esfuerzo(1500);
		assertEquals(2,n);
	}
	@Test
	void testEsfuerzoAlto() {
		n = p.esfuerzo(3500);
		assertEquals(3,n);
	}
	@Test
	void testEsfuerzoMuyAlto() {
		n = p.esfuerzo(5500);
		assertEquals(4,n);
	}
	@Test
	void testEsfuerzoPro() {
		n = p.esfuerzo(6500);
		assertEquals(5,n);
	}
	@Test
	void testDemasiado() {
		Exception exception = assertThrows(IllegalArgumentException.class, () ->
        p.esfuerzo(999999999));
		 assertEquals("No me lo creo. Seguramente haya ocurrido un error", exception.getMessage());
	}
	@AfterAll
	static void AfterAll() {
		System.out.println("Fin de las pruebas");
	}
}

