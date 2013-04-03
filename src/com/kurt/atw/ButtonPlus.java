package com.kurt.atw;

public class ButtonPlus extends Operator {

	@Override
	public Operand apply(Operand firstOperand, Operand secondOperand) throws NotImplementedException {
		return new Operand(firstOperand.value() + secondOperand.value());
	}

}
