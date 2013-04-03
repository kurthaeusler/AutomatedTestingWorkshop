package com.kurt.atw;

public abstract class Operator extends Button {

	@Override
	public String displayValue() throws InvalidOperationException {
		throw new InvalidOperationException();
	}

	@Override
	public boolean isOperand() {
		return false;
	}

	public Operand apply(Operand firstOperand, Operand secondOperand)
			throws NotImplementedException {
		throw new NotImplementedException();
	}

}
