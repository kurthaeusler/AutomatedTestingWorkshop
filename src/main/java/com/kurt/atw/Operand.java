package com.kurt.atw;

public class Operand extends Button {
	
	private int _value;

	public Operand(int i) {
		_value = i;
	}

	public String displayValue() throws NotImplementedException {

		return Integer.toString(_value);
	}

	@Override
	public boolean isOperand() {
		return true;
	}

	public int value(){

		return _value;
	}
	

}
