package ch.bbw.ml.ConsoleCalculatorWithMaven;

/**
 * Calculator
 * @author Lenny
 * @version 0.0.1
 */

public class Calculator {
    public int addition(int summand1, int summand2)
    {
        return summand1 + summand2;
    }
    protected int subtraction(int minuend, int subtrahend)
    {
    	return minuend - subtrahend;
    }
    int division(int dividend, int divisor)
    {
    	return dividend / divisor;
    }
    private int multiplication(int multiplikand, int multiplikator) {
    	return multiplikand * multiplikator;
    }
    public int multiplicationTesting(int multiplikand, int multiplikator) {
    	return multiplication(multiplikand, multiplikator);
    }
}