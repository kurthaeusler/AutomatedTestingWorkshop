package com.kurt.atw;

import java.util.Stack;

public abstract class Operator extends StackItem {

	@Override
	public String displayValue() throws CalculatorException {
		throw new CalculatorException();
	}

	public Operand apply(Operand firstOperand, Operand secondOperand)
			throws CalculatorException {
		throw new CalculatorException();
	}

	@Override
	public int value() throws CalculatorException {
		throw new CalculatorException();
	}

	@Override
	public void doSomething(Stack<StackItem> _stack) throws CalculatorException {
		// TODO Auto-generated method stub

	}

}
