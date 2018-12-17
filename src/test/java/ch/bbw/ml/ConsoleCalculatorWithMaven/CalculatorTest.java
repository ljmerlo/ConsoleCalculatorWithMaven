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
		assertTrue(testee.summe(10, 25) == 35);
	}
}
