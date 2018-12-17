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
	
	//Addition

	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.addition(10, 25) == 35);
	}
	
	@Test
	public void testSummeZweiNegativeIsOk() {
		assertTrue(testee.addition((-10), (-5)) == (-15));
	}
	
	@Test
	public void testSummeOnePosOneNegIsOk() {
		assertTrue(testee.addition(20, (-10)) == 10);
	}
	
	@Test
	public void testSummeOneNegOnePosIsOk() {
		assertTrue(testee.addition((-10), 20) == 10);
	}
	
	@Test
	public void testSummeMaxPlusOneIsOk() {
		assertTrue(testee.addition(Integer.MAX_VALUE, 1) == Integer.MIN_VALUE);
	}
	
	@Test
	public void testSummeMinPlusMinusOneIsOk() {
		assertTrue(testee.addition(Integer.MIN_VALUE, (-1)) == Integer.MAX_VALUE);
	}
	
	//Subtraction
	
	@Test
	public void testDifferenzZweiPositiveIsOk() {
		assertTrue(testee.subtraction(10, 25) == -15);
	}
	
	//Division
	
	@Test
	public void testQuotientZweiPositiveIsOk() {
		assertTrue(testee.division(30, 10) == 3);
	}
}
