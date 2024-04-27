package com.env.transexp;

import org.junit.jupiter.api.*;
//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

public class Calculator_Tests 
{
	Calculator calc;
	
	@BeforeEach
	void setUp() {
		calc =  new Calculator();
	}
	
	@Test
	@DisplayName("Simple multiplication should work")
	void testMultiplication() {
		assertEquals(20, calc.multiply(4, 5), "regular Multiplaction should work");
	}

	@RepeatedTest(5)
	@DisplayName("Ensure correct handeling of zeros")
	void TestMultplyWithZero() {
		assertEquals(0, calc.multiply(0, 5), "Multiply with Zero should work");
		assertEquals(0, calc.multiply(5, 0), "Multply with Zero shoudl work");
	}
	
	byte x = 1;
	byte y  = 0;
	@Test
	@DisplayName("Simple bool 'Or' Operation")
	void Or_BooleanOrOperation_true() {
		assertTrue(calc.OR(x, y), "Boolean operation is true");
	}
	void Or_BooleanOrOperation_false() {
		assertFalse(calc.OR(y, y), "Boolean operation is false");
	}
	
	@Test
	@DisplayName("Test All")
	void OrAnd_BooleanOperation_true() {
		assertAll(Boolean.toString(false), 
				() -> assertTrue(calc.OR(x, y), "Boolean Operation true"),
				() -> assertTrue(calc.AND(x, x), "Boolean Operation true")
				);
	}
}
