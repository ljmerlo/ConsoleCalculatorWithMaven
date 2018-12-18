package ch.bbw.ml.ConsoleCalculatorWithMaven;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Class for Class Calculator
 * @author Lenny
 * @version 3.0.1
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
	
	@Test
	public void testSummeMaxMinusMin() {
		assertTrue(testee.addition(Integer.MAX_VALUE, Integer.MIN_VALUE) == (-1));
	}
	
	@Test
	public void testSummeMaxMinusMinusMin() {
		assertTrue(testee.addition(Integer.MAX_VALUE, (-Integer.MIN_VALUE)) == (-1));
	}
	
	//Subtraction
	
	@Test
	public void testDifferenzZweiPositiveIsOk() {
		assertTrue(testee.subtraction(10, 25) == -15);
	}
	
	@Test
	public void testDifferenzZweiNegativeIsOk() {
		assertTrue(testee.subtraction((-10), (-10)) == 0);
	}
	
	@Test
	public void testDifferenzOnePosOneNegIsOk() {
		assertTrue(testee.subtraction(10, (-10)) == 20);
	}
	
	@Test
	public void testDifferenzOneNegOnePosIsOk() {
		assertTrue(testee.subtraction((-10), 10) == (-20));
	}
	
	@Test
	public void testDifferenzMaxMinusMinIsOk() {
		assertTrue(testee.subtraction(Integer.MAX_VALUE, Integer.MIN_VALUE) == (-1));
	}
	
	@Test
	public void testDifferenzMaxMinusMinusMinIsOk() {
		assertTrue(testee.subtraction(Integer.MAX_VALUE, (-Integer.MIN_VALUE)) == (-1));
	}
	
	@Test
	public void testDifferenzMinMinusMaxIsOk() {
		assertTrue(testee.subtraction(Integer.MIN_VALUE, (-Integer.MAX_VALUE)) == (-1));
	}
	
	@Test
	public void testDifferenzNegMinMinusMaxIsOk() {
		assertTrue(testee.subtraction((-Integer.MIN_VALUE), Integer.MAX_VALUE) == (1));
	}
	
	//Division
	
	@Test
	public void testQuotientZweiPositiveIsOk() {
		assertTrue(testee.division(30, 10) == 3);
	}
	
	@Test
	public void testQuotientZweiNegativeIsOk() {
		assertTrue(testee.division((-30), (-10)) == 3);
	}

	@Test(expected=java.lang.ArithmeticException.class)
	public void testQuotientPosDivByZeroIsOk() {
		assertTrue(testee.division(30, 0) == 0);
	}
	
	@Test
	public void testQuotientZeroDivByPosIsOk() {
		assertTrue(testee.division(0, 30) == 0);
	}
	
	@Test
	public void testQuotientMaxDivByMinIsOk() {
		assertTrue(testee.division(Integer.MAX_VALUE, Integer.MIN_VALUE) == 0);
	}
	
	@Test
	public void testQuotientMaxDivByPosIsOk() {
		assertTrue(testee.division(Integer.MAX_VALUE, 12) == 178956970);
	}
	
	@Test(expected=NumberFormatException.class)
	public void testQuotientMaxDivByStringIsOk() {
		assertTrue(testee.division(Integer.MAX_VALUE, Integer.parseInt("n")) == 25);
	}
	
	@Test
	public void testQuotientPosByPosWithRoundingIsOk() {
		assertTrue(testee.division(1, 2) == 0);
	}
	
	//Multiplication
	
	@Test
	public void testProductZweiPositiveIsOk() {
		assertTrue(testee.multiplicationTesting(5, 5) == 25);
	}
	
	@Test
	public void testProductZweiNegativeIsOk() {
		assertTrue(testee.multiplicationTesting((-5), (-5)) == 25);
	}
	
	@Test
	public void testProductPosMalZeroIsOk() {
		assertTrue(testee.multiplicationTesting(5, 0) == 0);
	}
	
	@Test
	public void testProductZweiZeroIsOk() {
		assertTrue(testee.multiplicationTesting(0, 0) == 0);
	}
	
	@Test
	public void testProductTwoMaxIsOk() {
		assertTrue(testee.multiplicationTesting(Integer.MAX_VALUE, Integer.MAX_VALUE) == 1);
	}
	
	@Test
	public void testProductTwoMinIsOk() {
		assertTrue(testee.multiplicationTesting(Integer.MIN_VALUE, Integer.MIN_VALUE) == 0);
	}
	
	@Test(expected=NumberFormatException.class)
	public void testProductPosAndStringIsOk() {
		assertTrue(testee.multiplicationTesting(5, Integer.parseInt("n")) == 25);
	}
	
	@Test
	public void testProductOnePosOneNegIsOk() {
		assertTrue(testee.multiplicationTesting(5, (-5)) == (-25));
	}
}
