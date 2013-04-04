package com.kurt.atw;

import java.util.Stack;

public class StackItem {

	public static StackItem create(String buttonPush)
			throws NotImplementedException {
		if (buttonPush.length() == 1 && buttonPush.charAt(0) >= '0'
				&& buttonPush.charAt(0) <= '9')
			return new Operand(Integer.parseInt(buttonPush));
		if (buttonPush.equals("+"))
			return new Plus();
		if (buttonPush.equals("="))
			return new Equals();
		throw new NotImplementedException();
	}

	public String displayValue() throws InvalidOperationException {
		// TODO Auto-generated method stub
		return null;
	}

	public void doSomething(Stack<StackItem> _stack)
			throws NotImplementedException {
		// TODO Auto-generated method stub

	}
}
