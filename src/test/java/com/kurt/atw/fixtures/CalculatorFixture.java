package com.kurt.atw.fixtures;

import com.kurt.atw.Calculator;
import com.kurt.atw.InvalidOperationException;
import com.kurt.atw.NotImplementedException;
import com.kurt.atw.StackItem;

public class CalculatorFixture {

	private Calculator _calculator;

	public CalculatorFixture() {
		_calculator = new Calculator();
	}

	public String displayShouldBe() {
		return _calculator.displayShouldBe();
	}

	public void push(String button) throws InvalidOperationException,
			NotImplementedException {
		_calculator.push(StackItem.create(button));
	}

}
