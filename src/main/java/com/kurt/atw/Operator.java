package com.kurt.atw;

public abstract class Operator extends StackItem {

	@Override
	public String displayValue() throws InvalidOperationException {
		throw new InvalidOperationException();
	}

	public Operand apply(Operand firstOperand, Operand secondOperand)
			throws NotImplementedException {
		throw new NotImplementedException();
	}

}
