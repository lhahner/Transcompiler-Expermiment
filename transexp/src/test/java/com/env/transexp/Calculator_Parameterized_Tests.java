package com.env.transexp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class Calculator_Parameterized_Tests {
		Calculator calc;

		@BeforeEach
		void setUp() {
			calc = new Calculator();
		}
		// ParameterizedTest----------
		@ParameterizedTest
		@ValueSource(ints = { 1, 3, 5, -3, 15, Integer.MAX_VALUE }) // six numbers
		void isOdd_ShouldReturnTrueForOddNumbers(int number) {
			assertTrue(calc.isOdd(number));
		}
}
