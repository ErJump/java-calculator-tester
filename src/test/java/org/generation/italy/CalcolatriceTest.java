package org.generation.italy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcolatriceTest {
	private Calcolatrice c = new Calcolatrice();
	
	@Test
	@DisplayName("Test addizione")
	void addTest() {
		float value = c.add(1, 2);
		assertEquals(3, value);
	}
	
	@Test
	@DisplayName("Test sottrazione")
	void subracTest() {
		float value = c.subtract(4, 10);
		assertEquals(-6, value);
	}
	
	@Test
	@DisplayName("Test moltiplicazione")
	void multiplyTest() {
		float value = c.multiply(4, 10);
		assertEquals(40, value);
	}
	
	@Test
	@DisplayName("Test divisione")
	void divideTest() throws Exception {
		float value = c.divide(4, 10);
		assertEquals(0.4f, value);
	}
	
	@Test
	@DisplayName("Test eccezione divisione /0")
	void exceptionDivideTest() {
		assertThrows(Exception.class, () -> c.divide(4, 0));
	}
}
