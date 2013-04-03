package com.kurt.atw;

import java.util.Stack;

public class Calculator {

	private String _display;
	private Stack<Button> _stack;

	public Calculator() {
		_stack = new Stack<Button>();
		turnOn();
	}

	public String displayShouldBe() {
		return _display;
	}

	public void push(Button button) throws InvalidOperationException,
			NotImplementedException {
		_stack.push(button);
		button.doSomething(_stack);
		if (_stack.peek().isOperand())
			_display = _stack.peek().displayValue() + ".";
	}

	public void turnOn() {
		reset();

	}

	public void reset() {
		_display = "0.";

	}
}