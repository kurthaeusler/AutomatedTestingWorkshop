package com.kurt.atw;

import java.util.Stack;

public class ButtonEquals extends Operator {
	
	@Override
	public void doSomething(Stack<Button> stack) throws NotImplementedException
	{
		Operator thisEqualsButton = (ButtonEquals) stack.pop();
		assert(this == thisEqualsButton);
		Operand secondOperand = (Operand) stack.pop();
		Operator operator = (Operator) stack.pop();
		Operand firstOperand = (Operand) stack.pop();
		
		Operand result = operator.apply(firstOperand, secondOperand);
		stack.push(result);
	}
}
