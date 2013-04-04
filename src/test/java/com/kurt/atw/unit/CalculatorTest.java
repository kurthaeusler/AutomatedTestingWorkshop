package com.kurt.atw.unit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kurt.atw.Calculator;

public class CalculatorTest {

	@Test
	public void testDisplay() {
		Calculator calculator = new Calculator();

		assertEquals("0.", calculator.displayShouldBe());
	}

}
