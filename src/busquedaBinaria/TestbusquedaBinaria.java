package busquedaBinaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestbusquedaBinaria {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testBuscar1() {
		BusquedaBinaria b = new BusquedaBinaria();
		int x[] = {1,2,3,4,5,6,7,8,9,10};
		int srch = 1;
		int hiIndex = 3;
		boolean esperado = true;
		try {
			assertEquals(esperado,b.buscar(x, srch, hiIndex));	
		}catch(IndexOutOfBoundsException e) {
			System.out.println("ERROR: " + e.getMessage());
		}catch(ArrayNoOrdenadoException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
	}
	
	@Test
	void testBuscar2() {
		BusquedaBinaria b = new BusquedaBinaria();
		int x[] = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
		int srch = 15;
		int hiIndex = 8;
		boolean esperado = false;
		try {
			assertEquals(esperado,b.buscar(x, srch, hiIndex));	
		}catch(IndexOutOfBoundsException e) {
			System.out.println("ERROR: " + e.getMessage());
		}catch(ArrayNoOrdenadoException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
	}
	
	@Test
	void testBuscar3() {
		BusquedaBinaria b = new BusquedaBinaria();
		int x[] = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
		int srch = 10;
		int hiIndex = 20;
		boolean esperado = false;
		try {
			assertEquals(esperado,b.buscar(x, srch, hiIndex));	
		}catch(IndexOutOfBoundsException e) {
			System.out.println("ERROR: " + e.getMessage());
		}catch(ArrayNoOrdenadoException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
	}

}

