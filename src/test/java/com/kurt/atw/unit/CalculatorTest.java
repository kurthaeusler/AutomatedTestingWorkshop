package com.kurt.atw.unit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kurt.atw.Calculator;
import com.kurt.atw.CalculatorException;
import com.kurt.atw.Equals;
import com.kurt.atw.Operand;
import com.kurt.atw.Plus;

public class CalculatorTest {

	@Test
	public void testInitialDisplay() {
		Calculator calculator = new Calculator();

		assertEquals("0.", calculator.displayShouldBe());
	}

	@Test
	public void testDisplayAfterButtonPush() throws CalculatorException {
		Calculator calculator = new Calculator();
		calculator.push(new Operand(5));
		assertEquals("5.", calculator.displayShouldBe());
	}

	@Test
	public void simpleAdditionTest() throws CalculatorException {
		Calculator calculator = new Calculator();
		calculator.push(new Operand(5));
		assertEquals("5.", calculator.displayShouldBe());
		calculator.push(new Plus());
		assertEquals("5.", calculator.displayShouldBe());
		calculator.push(new Operand(7));
		assertEquals("7.", calculator.displayShouldBe());
		calculator.push(new Equals());
		assertEquals("12.", calculator.displayShouldBe());
	}

	@Test
	public void testTurnOn() {
		Calculator calculator = new Calculator();
		calculator.turnOn();
		assertEquals("0.", calculator.displayShouldBe());
	}

	@Test
	public void testReset() {
		Calculator calculator = new Calculator();
		calculator.reset();
		assertEquals("0.", calculator.displayShouldBe());
	}

}
