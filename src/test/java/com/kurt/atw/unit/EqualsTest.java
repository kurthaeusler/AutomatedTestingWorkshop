package com.kurt.atw.unit;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

import com.kurt.atw.CalculatorException;
import com.kurt.atw.Equals;
import com.kurt.atw.Operand;
import com.kurt.atw.Plus;
import com.kurt.atw.StackItem;

public class EqualsTest {

	@Test
	public void doSomethingTest() throws CalculatorException {
		Equals equals = new Equals();
		Stack<StackItem> stack = new Stack<StackItem>();

		stack.push(new Operand(5));
		stack.push(new Plus());
		stack.push(new Operand(7));
		stack.push(equals);

		equals.doSomething(stack);

		assertEquals(12, stack.peek().value());
	}

}
