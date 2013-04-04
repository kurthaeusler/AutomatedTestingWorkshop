package com.kurt.atw.fixtures;

import com.kurt.atw.Calculator;
import com.kurt.atw.CalculatorException;
import com.kurt.atw.StackItem;

public class CalculatorFixture {

	private Calculator _calculator;

	public CalculatorFixture() {
		_calculator = new Calculator();
	}

	public String displayShouldBe() {
		return _calculator.displayShouldBe();
	}

	public void push(String button) throws CalculatorException {
		_calculator.push(StackItem.create(button));
	}

}
