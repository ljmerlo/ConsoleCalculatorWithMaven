package ch.bbw.ml.ConsoleCalculatorWithMaven;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test Class for Class Calculator
 * @author Lenny
 * @version 0.0.1
 */

public class CalculatorTest {
	Calculator testee;

	@Test
	public void testSummeZeiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.addition(10, 25) == 35);
	}
	
	@Test
	public void testDifferenzZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.subtraction(10, 25) == -15);
	}
}
