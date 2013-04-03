package com.kurt.atw;

import java.util.Stack;

public abstract class Button {
	
	public static Button create(String buttonPush) throws NoSuchButtonException
	{
		switch(buttonPush)
		{
		case "1":
			return new ButtonOne();
		case "2":
			return new ButtonTwo();
		case "3":
			return new ButtonThree();
		case "4":
			return new ButtonFour();
		case "5":
			return new ButtonFive();
		case "6":
			return new ButtonSix();
		case "7":
			return new ButtonSeven();
		case "8":
			return new ButtonEight();
		case "9":
			return new ButtonNine();
		case "0":
			return new ButtonZero();
		case "+":
			return new ButtonPlus();
		case "=":
			return new ButtonEquals();
		default:
				throw new NoSuchButtonException();
		}
	}

	public abstract boolean isOperand();

	public abstract String displayValue() throws InvalidOperationException, NotImplementedException;

	public void doSomething(Stack<Button> stack) throws NotImplementedException
	{
		return;
	}
	
}
