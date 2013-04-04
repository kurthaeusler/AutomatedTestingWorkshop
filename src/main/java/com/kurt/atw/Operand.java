package com.kurt.atw;

import java.util.Stack;

public class Operand extends StackItem {

	private int _value;

	public Operand(int i) {
		_value = i;
	}

	public String displayValue() {

		return Integer.toString(_value);
	}

	public int value() {

		return _value;
	}

	@Override
	public void doSomething(Stack<StackItem> _stack) {
		// TODO Auto-generated method stub

	}

}
