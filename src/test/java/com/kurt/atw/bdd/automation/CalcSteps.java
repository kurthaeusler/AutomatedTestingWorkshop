package com.kurt.atw.bdd.automation;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.kurt.atw.Calculator;
import com.kurt.atw.CalculatorException;
import com.kurt.atw.StackItem;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CalcSteps {
	private Calculator _calculator;

	@Given("that the calulator exists")
	public void givenThatTheCalulatorExists() {
		_calculator = new Calculator();
	}

	@When("the calculator is turned on")
	public void whenTheCalculatorIsTurnedOn() {
		_calculator.turnOn();
	}

	@Then("the display should read $display")
	public void thenTheDisplayShouldRead(@Named("display") String display) {
		assertThat(_calculator.displayShouldBe(), equalTo(display));
	}

	@Given("that the calculator is reset")
	public void givenThatTheCalculatorIsReset() {
		_calculator.reset();
	}

	@When("a <button push> occurs")
	public void whenAbuttonPushOccurs(@Named("button push") String buttonPush)
			throws CalculatorException {
		_calculator.push(StackItem.create(buttonPush));
	}

}
