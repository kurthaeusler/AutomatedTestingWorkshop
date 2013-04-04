package com.kurt.atw;

import java.util.Stack;

public class Calculator {

	private String _display;
	private Stack<StackItem> _stack;

	public Calculator() {
		_stack = new Stack<StackItem>();
		turnOn();
	}

	public String displayShouldBe() {
		return _display;
	}

	public void push(StackItem button) throws CalculatorException {
		_stack.push(button);
		button.doSomething(_stack);
		if (_stack.peek() instanceof Operand)
			_display = _stack.peek().displayValue() + ".";
	}

	public void turnOn() {
		reset();

	}

	public void reset() {
		_display = "0.";

	}
}
