package com.kurt.atw;

import java.util.Stack;

public abstract class StackItem {

	public static StackItem create(String buttonPush)
			throws CalculatorException {
		if (buttonPush.length() == 1 && buttonPush.charAt(0) >= '0'
				&& buttonPush.charAt(0) <= '9')
			return new Operand(Integer.parseInt(buttonPush));
		if (buttonPush.equals("+"))
			return new Plus();
		if (buttonPush.equals("="))
			return new Equals();
		throw new CalculatorException();
	}

	public void doSomething(Stack<StackItem> _stack) throws CalculatorException {
		// Default is do nothing
	}

	public String displayValue() throws CalculatorException {
		throw new CalculatorException();
	}

	public Operand apply(Operand firstOperand, Operand secondOperand)
			throws CalculatorException {
		throw new CalculatorException();
	}

	public int value() throws CalculatorException {
		throw new CalculatorException();
	}
}
