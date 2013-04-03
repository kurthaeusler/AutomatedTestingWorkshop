package com.kurt.atw;

import static org.junit.Assert.*;

import org.junit.Test;

public class ButtonTest {

	@Test
	public void testCreateButtonZero() throws NoSuchButtonException {
		Button button = Button.create("0");
		assertTrue(button instanceof ButtonZero);	
	}
	
	@Test
	public void testCreateButtonOne() throws NoSuchButtonException {
		Button button = Button.create("1");
		assertTrue(button instanceof ButtonOne);	
	}
	
	@Test
	public void testCreateButtonTwo() throws NoSuchButtonException {
		Button button = Button.create("2");
		assertTrue(button instanceof ButtonTwo);	
	}
	
	@Test
	public void testCreateButtonThree() throws NoSuchButtonException {
		Button button = Button.create("3");
		assertTrue(button instanceof ButtonThree);	
	}
	
	@Test
	public void testCreateButtonFour() throws NoSuchButtonException {
		Button button = Button.create("4");
		assertTrue(button instanceof ButtonFour);	
	}
	
	@Test
	public void testCreateButtonFive() throws NoSuchButtonException {
		Button button = Button.create("5");
		assertTrue(button instanceof ButtonFive);	
	}
	
	@Test
	public void testCreateButtonSix() throws NoSuchButtonException {
		Button button = Button.create("6");
		assertTrue(button instanceof ButtonSix);	
	}
	
	@Test
	public void testCreateButtonSeven() throws NoSuchButtonException {
		Button button = Button.create("7");
		assertTrue(button instanceof ButtonSeven);	
	}
	
	@Test
	public void testCreateButtonEight() throws NoSuchButtonException {
		Button button = Button.create("8");
		assertTrue(button instanceof ButtonEight);	
	}
	
	@Test
	public void testCreateButtonNine() throws NoSuchButtonException {
		Button button = Button.create("9");
		assertTrue(button instanceof ButtonNine);	
	}
	
	@Test
	public void testCreateButtonPlus() throws NoSuchButtonException {
		Button button = Button.create("+");
		assertTrue(button instanceof ButtonPlus);	
	}
	
	@Test
	public void testCreateButtonEquals() throws NoSuchButtonException {
		Button button = Button.create("=");
		assertTrue(button instanceof ButtonEquals);	
	}

}
