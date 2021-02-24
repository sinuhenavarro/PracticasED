package practicasED;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numerosCompuestosTest {
	
	@Test
	void testEsCompuesto() {
		assertEquals(false,NumerosCompuestos.esCompuesto(1));
		assertEquals(true,NumerosCompuestos.esCompuesto(2));
		assertEquals(true,NumerosCompuestos.esCompuesto(3));
		assertEquals(true,NumerosCompuestos.esCompuesto(4));

	}
	

}
