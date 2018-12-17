package ch.bbw.ml.ConsoleCalculatorWithMaven;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Class for Class Calculator
 * @author Lenny
 * @version 0.0.1
 */

public class CalculatorTest {
	
	Calculator testee;
	
	@Before
	public void setUp() {
		testee = new Calculator();
	}

	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.addition(10, 25) == 35);
	}
	
	@Test
	public void testSummeZweiNegativeIsOk() {
		assertTrue(testee.addition((-10), (-5)) == (-15));
	}
	
	@Test
	public void testDifferenzZweiPositiveIsOk() {
		assertTrue(testee.subtraction(10, 25) == -15);
	}
	
	@Test
	public void testQuotientZweiPositiveIsOk() {
		assertTrue(testee.division(30, 10) == 3);
	}
}
