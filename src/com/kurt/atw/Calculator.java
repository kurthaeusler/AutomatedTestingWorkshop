package com.kurt.atw;

public class Calculator {
	
	private String _display;
	
	public String displayShouldBe()
	{
		return _display;
	}
	public void push(Button button)
	{
		_display = button.displayValue();
	}
	public void turnOn() {
		reset();
		
	}
	public void reset() {
		_display = "0.";
		
	}
}
