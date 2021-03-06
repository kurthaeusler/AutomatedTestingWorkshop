package com.kurt.atw;

public class Plus extends Operator {

	@Override
	public Operand apply(Operand firstOperand, Operand secondOperand) {
		return new Operand(firstOperand.value() + secondOperand.value());
	}

}
